file(GLOB INCLUDES src/*.h src/**/*.h src/**/**/*.h src/**/**/**/*.h)
file(GLOB SOURCES src/*.cpp src/**/*.cpp src/**/**/*.cpp src/**/**/**/*.cpp)

list(APPEND CMAKE_MODULE_PATH ${CMAKE_CURRENT_SOURCE_DIR}/cmake)

link_directories(game ${ShineLibDir})

option(Need_Run "Need run" ON)
set(Need_Run OFF)

if (Need_Run)
    message(Up)
    add_executable(game ${SOURCES})

    install(TARGETS game
            RUNTIME DESTINATION bin
            BUNDLE DESTINATION bin
            )
else()
    message(Down)
    add_library(game SHARED ${SOURCES})

    install(TARGETS game
            ARCHIVE DESTINATION lib
            LIBRARY DESTINATION lib
            COMPONENT library
            )
endif ()

add_dependencies(game shine commonGame)
target_link_libraries(game Recast Detour DetourCrowd DetourTileCache DebugUtils shine commonGame )

install(FILES ${INCLUDES} DESTINATION include)

if(NOT Need_Run)
    message(A1)
    if(WIN32)
        add_custom_command(TARGET game POST_BUILD
                COMMAND ${CMAKE_COMMAND} -E copy
                "${CMAKE_CURRENT_BINARY_DIR}/game.dll"
                "${CMAKE_CURRENT_SOURCE_DIR}/../../bin/lib/windows/")
    elseif(APPLE)
        message(A2)
        add_custom_command(TARGET game POST_BUILD
                COMMAND ${CMAKE_COMMAND} -E copy
                "${CMAKE_CURRENT_BINARY_DIR}/libgame.dylib"
                "${CMAKE_CURRENT_SOURCE_DIR}/../../bin/lib/mac/")
    else()
        message(A3)
        add_custom_command(TARGET game POST_BUILD
                COMMAND ${CMAKE_COMMAND} -E copy
                "${CMAKE_CURRENT_BINARY_DIR}/libgame.so"
                "${CMAKE_CURRENT_SOURCE_DIR}/../../bin/lib/linux/")
    endif()

endif()



