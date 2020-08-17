cmake_minimum_required(VERSION 3.0)
project(projectC)

#add_definitions(-std=c++0x)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# lib versions
SET(SOVERSION 1)
SET(VERSION 1.0.0)

message(WIN32,${WIN32})
message(APPLE,${APPLE})

if(WIN32)
    SET(CMAKE_BUILD_TYPE "Debug")
    set(ShineLibDir "${CMAKE_CURRENT_SOURCE_DIR}/shineLib/recastnavigation/lib/x64/Debug")
    set(JNI_DIR "jni/windows/*.h")
elseif(APPLE)
    SET(CMAKE_BUILD_TYPE "Release")
    add_definitions(-fdeclspec)
    add_definitions(-fPIC)
    set(ShineLibDir "${CMAKE_CURRENT_SOURCE_DIR}/shineLib/recastnavigation/lib/mac/Debug")
    set(JNI_DIR "jni/mac/*.h")
else()
    SET(CMAKE_BUILD_TYPE "Release")
    add_definitions(-fPIC)
    set(ShineLibDir "${CMAKE_CURRENT_SOURCE_DIR}/shineLib/recastnavigation/lib/linux/Release")
    set(JNI_DIR "jni/linux/*.h")

    message(${CMAKE_CURRENT_SOURCE_DIR})
endif()

set(ShineLibPath "${CMAKE_CURRENT_SOURCE_DIR}/shineLib")

include_directories(${ShineLibPath}/recastnavigation/Recast/Include)
include_directories(${ShineLibPath}/recastnavigation/Detour/Include)
include_directories(${ShineLibPath}/recastnavigation/DetourCrowd/Include)
include_directories(${ShineLibPath}/recastnavigation/DetourTileCache/Include)
include_directories(${ShineLibPath}/recastnavigation/DebugUtils/Include)

add_subdirectory(shine)
add_subdirectory(commonGame)
add_subdirectory(game)
