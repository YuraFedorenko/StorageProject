create sequence hibernate_sequence start with 1 increment by 1

create table file (
id bigint not null, 
file_format varchar(255), 
file_name varchar(255), 
file_size bigint, 
storage_id bigint, 
primary key (id))

create table storage (
id bigint not null, 
formats_supported binary(255), 
storage_country varchar(255), 
storage_size bigint not null, 
primary key (id))

alter table file 
add constraint file_storage_FK 
foreign key (storage_id) references storage