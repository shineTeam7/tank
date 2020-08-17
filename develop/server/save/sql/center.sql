create database if not exists `try_center` default charset= utf8;
use `try_center`;


create table if not exists `global` (
	`key` int(10) not null,
	`dataVersion` int(10) not null,
	`saveDate` date not null,
	`data` longblob not null,
	primary key (`key`)
) engine=InnoDB default charset= utf8 comment='全局表';

create table if not exists `server` (
	`areaID` int(10) not null,
	`nowAreaID` int(10) not null,
	`name` varchar(128) not null,
	primary key (`areaID`)
) engine=InnoDB default charset= utf8 comment='服务器信息表';

create table if not exists `user` (
	`userID` int(10) not null auto_increment,
	`puid` varchar(128) not null,
	`platform` varchar(128) not null,
	`isAdult` tinyint(1) not null,
	`areaID` int(10) not null,
	`playerIDs` varchar(128) not null,
	primary key (`userID`),
	key `"puid"` (`puid`)
) engine=InnoDB default charset= utf8 comment='用户表';