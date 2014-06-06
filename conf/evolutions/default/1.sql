# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table derivation_code (
  id                        integer not null,
  code                      varchar(255),
  description               varchar(255),
  constraint pk_derivation_code primary key (id))
;

create table food (
  id                        integer not null,
  group_id                  integer,
  long_description          varchar(255),
  short_description         varchar(255),
  common_names              varchar(255),
  scientific_name           varchar(255),
  manufacturer_name         varchar(255),
  survey                    varchar(255),
  refuse_description        varchar(255),
  refuse_percent            integer,
  nitrogen_factor           float,
  protein_factor            float,
  fat_factor                float,
  carbohydrate_factor       float,
  constraint pk_food primary key (id))
;

create table food_group (
  id                        integer not null,
  group_code                integer,
  description               varchar(255),
  constraint pk_food_group primary key (id))
;

create table food_nutrient (
  id                        integer not null,
  food_id                   integer,
  nutrient_id               integer,
  value                     float,
  derivation_code_id        integer,
  source_code_id            integer,
  constraint pk_food_nutrient primary key (id))
;

create table food_weight (
  id                        bigint not null,
  food_id                   integer,
  sequence_num              integer,
  amount                    float,
  description               varchar(255),
  gram_weight               float,
  constraint pk_food_weight primary key (id))
;

create table langual_factor (
  id                        integer not null,
  factor_code               varchar(255),
  description               varchar(255),
  constraint pk_langual_factor primary key (id))
;

create table food_nutrient (
  id                        integer not null,
  food_id                   integer,
  factor_id                 integer,
  constraint pk_food_nutrient primary key (id))
;

create table nutrient (
  id                        integer not null,
  units                     varchar(255),
  tagname                   varchar(255),
  description               varchar(255),
  num_decimal               integer,
  sort_order                integer,
  constraint pk_nutrient primary key (id))
;

create table source_code (
  id                        integer not null,
  description               varchar(255),
  constraint pk_source_code primary key (id))
;

create sequence derivation_code_seq;

create sequence food_seq;

create sequence food_group_seq;

create sequence food_nutrient_seq;

create sequence food_weight_seq;

create sequence langual_factor_seq;

create sequence food_nutrient_seq;

create sequence nutrient_seq;

create sequence source_code_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists derivation_code;

drop table if exists food;

drop table if exists food_group;

drop table if exists food_nutrient;

drop table if exists food_weight;

drop table if exists langual_factor;

drop table if exists food_nutrient;

drop table if exists nutrient;

drop table if exists source_code;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists derivation_code_seq;

drop sequence if exists food_seq;

drop sequence if exists food_group_seq;

drop sequence if exists food_nutrient_seq;

drop sequence if exists food_weight_seq;

drop sequence if exists langual_factor_seq;

drop sequence if exists food_nutrient_seq;

drop sequence if exists nutrient_seq;

drop sequence if exists source_code_seq;

