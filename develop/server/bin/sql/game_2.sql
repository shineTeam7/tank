create database if not exists `tank_game_1` default charset= utf8;
use `tank_game_1`;


create table if not exists `global` (
	`key` int(10) not null,
	`dataVersion` int(10) not null,
	`saveDate` date not null,
	`data` longblob not null,
	primary key (`key`)
) engine=InnoDB default charset= utf8 comment='全局表';

create table if not exists `player` (
	`playerID` bigint(20) not null,
	`name` varchar(128) not null,
	`userID` bigint(20) not null,
	`createAreaID` int(10) not null,
	`uid` varchar(128) not null,
	`platform` varchar(128) not null,
	`appVersion` int(10) not null,
	`sourceVersion` int(10) not null,
	`createDate` date not null,
	`saveDate` date not null,
	`loginData` longblob not null,
	`data` longblob not null,
	`offlineData` longblob not null,
	primary key (`playerID`),
	key `"name"` (`name`),
	key `"userID_createAreaID"` (`userID`,`createAreaID`),
	key `"uid"` (`uid`)
) engine=InnoDB default charset= utf8 comment='角色表';

create table if not exists `rolesocial` (
	`playerID` bigint(20) not null,
	`data` longblob not null,
	primary key (`playerID`)
) engine=InnoDB default charset= utf8 comment='角色社交数据表';

create table if not exists `rolegroup` (
	`groupID` bigint(20) not null,
	`createAreaID` int(10) not null,
	`funcID` int(10) not null,
	`createDate` date not null,
	`data` longblob not null,
	primary key (`groupID`)
) engine=InnoDB default charset= utf8 comment='玩家群表';