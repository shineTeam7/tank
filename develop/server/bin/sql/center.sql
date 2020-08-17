create database if not exists `tank_center` default charset= utf8;
use `tank_center`;


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
	`userID` bigint(20) not null,
	`puid` varchar(128) not null,
	`platform` varchar(128) not null,
	`isAdult` tinyint(1) not null,
	`areaID` int(10) not null,
	`playerIDs` varchar(128) not null,
	`sourceUserID` bigint(20) not null,
	primary key (`userID`),
	key `"puid"` (`puid`)
) engine=InnoDB default charset= utf8 comment='用户表';

create table if not exists `rolesocial` (
	`playerID` bigint(20) not null,
	`data` longblob not null,
	primary key (`playerID`)
) engine=InnoDB default charset= utf8 comment='角色社交数据表';

create table if not exists `whitelist` (
	`id` int(10) not null auto_increment,
	`type` int(10) not null,
	`value` varchar(128) not null,
	primary key (`id`)
) engine=InnoDB default charset= utf8 comment='白名单表';

create table if not exists `activationcode` (
	`code` varchar(128) not null,
	`id` int(10) not null,
	`lastNum` int(10) not null,
	`bornTime` bigint(20) not null,
	`disableTime` bigint(20) not null,
	primary key (`code`)
) engine=InnoDB default charset= utf8 comment='激活码表';

create table if not exists `playername` (
	`name` varchar(128) not null,
	`playerID` bigint(20) not null,
	primary key (`name`)
) engine=InnoDB default charset= utf8 comment='中心服角色名字表';

create table if not exists `unionname` (
	`name` varchar(128) not null,
	`groupID` bigint(20) not null,
	primary key (`name`)
) engine=InnoDB default charset= utf8 comment='工会名字表';

create table if not exists `auctionitem` (
	`instanceID` bigint(20) not null,
	`playerID` bigint(20) not null,
	`data` longblob not null,
	`sellTime` bigint(20) not null,
	`itemID` int(10) not null,
	`itemLevel` int(10) not null,
	`itemType` int(10) not null,
	`itemSecondType` int(10) not null,
	`itemNum` int(10) not null,
	`price` int(10) not null,
	primary key (`instanceID`),
	key `"playerID"` (`playerID`),
	key `"itemID"` (`itemID`),
	key `"itemLevel"` (`itemLevel`),
	key `"itemType"` (`itemType`),
	key `"itemSecondType"` (`itemSecondType`)
) engine=InnoDB default charset= utf8 comment='拍卖行表';