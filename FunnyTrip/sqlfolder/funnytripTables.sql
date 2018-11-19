create table tourSuggestion(
tournumber number(8) constraint toursuggetion_pk primary key,
guidenumber number(8) constraint toursuggetion_fk references guide(guidenumber),
tourstart date not null,
tourend date not null
);

create table tourSuggestion_board_text(
boardNumber number(4) constraint tour_text_pk primary key,
tourNumber number(8) constraint tour_text_fk references toursuggestion(tournumber),
text clob
);

create table tourSuggestion_board_imgSrc(
boardNumber number(4) constraint tour_imgSrc_pk primary key,
tourNumber number(8) constraint tour_imgSrc_fk references toursuggestion(tournumber),
imgSrc varchar2(200)
);

create table tourSuggestion_board_audioSrc(
boardNumber number(4) constraint tour_audioSrc_pk primary key,
tourNumber number(8) constraint tour_audioSrc_fk references toursuggestion(tournumber),
audioSrc varchar2(200)
);

create table member(
memberNumber number(8) constraint tourguide_pk primary key,
id_email varchar2(30) unique not null,
pw varchar2(30) not null,
regDate date not null,
gender varchar2(6) not null,
TourGuideCount number(4) default 0,
message varchar2(1000),
imgsrc varchar2(200),
birth date
);
