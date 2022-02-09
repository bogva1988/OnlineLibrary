create sequence if not exists online_library.app_book_sequence start 1 increment 1;
create sequence if not exists online_library.ref_author_sequence start 1 increment 1;
create sequence if not exists online_library.app_big_data_sequence start 1 increment 1;
create sequence if not exists online_library.ref_genre_sequence start 1 increment 1;
create sequence if not exists online_library.ref_user_sequence start 1 increment 1;

create table if not exists online_library.ref_user (
      id int8 not null,
      login varchar (150) not null,
      password varchar (150) not null,
      name varchar (150) not null,
      surname varchar (150) not null,
      primary key (id)
);

create table if not exists online_library.ref_author (
        id int8 not null,
        name varchar (150) not null,
        surname varchar (150) not null,
        primary key (id)
);

create table if not exists online_library.ref_genre (
        id int8 not null,
        name varchar (150) not null,
        primary key (id)
);

create table if not exists online_library.app_big_data (
        id int8 not null,
        data oid not null,
        format varchar(10) not null,
        primary key (id)
);

create table if not exists online_library.app_book (
        id int8 not null,
        description varchar(1000) not null,
        name varchar(300) not null,
        author_id int8 not null,
        book_data_id int8 null,
        book_image_id int8 null,
        genre_id int8 not null,
        primary key (id)
);

alter table
    if exists online_library.app_book
        add constraint FK_author foreign key (author_id) references online_library.ref_author;
alter table
    if exists online_library.app_book
        add constraint FK_book_data foreign key (book_data_id) references online_library.app_big_data;
alter table
    if exists online_library.app_book
        add constraint FK_book_image foreign key (book_image_id) references online_library.app_big_data;
alter table
    if exists online_library.app_book
        add constraint FK_genre foreign key (genre_id) references online_library.ref_genre;