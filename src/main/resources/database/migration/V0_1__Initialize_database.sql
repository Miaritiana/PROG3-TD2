create table player(
    id  serial primary key,
    name varchar(50),
    number integer
)

create table sponsor(
    id serial primary key,
    name varchar(50)
)

create table team(
    id serial primary key,
    name varchar(60),
    sponsor references sponsor(id),
    players references player(id)
)

create table play_against(
    id serial primary key,
    stadium varchar(200),
    datetime timestamp,
    host references team(id),
    guest references team(id)
)