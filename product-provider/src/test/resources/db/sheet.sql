DROP SCHEMA IF EXISTS rose_sheet CASCADE;
CREATE SCHEMA rose_sheet;
SET search_path TO rose_sheet;

CREATE table tb_sheet
(
    id           BIGSERIAL PRIMARY KEY    NOT NULL,
    song_name    VARCHAR(20) UNIQUE       NOT NULL,
    lyric_author VARCHAR(20)                       DEFAULT NULL,
    compositor   VARCHAR(20)                       DEFAULT NULL,
    song_key     VARCHAR(5)                        DEFAULT NULL,
    tags         VARCHAR(50)                       DEFAULT NULL,
    topic        VARCHAR(20)                       DEFAULT NULL,
    picture_dir  VARCHAR(50)                       DEFAULT NULL,
    audio_dir    VARCHAR(50)                       DEFAULT NULL,
    type         VARCHAR(20)                       DEFAULT NULL,
    created      TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated      TIMESTAMP           DEFAULT CURRENT_TIMESTAMP
);

CREATE table tb_album
(
    id         BIGSERIAL PRIMARY KEY    NOT NULL,
    album_name VARCHAR(20) UNIQUE       NOT NULL,
    created    TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated    TIMESTAMP           DEFAULT CURRENT_TIMESTAMP
);

CREATE table tb_sheet_album
(
    id       BIGSERIAL PRIMARY KEY NOT NULL,
    name     VARCHAR(20)           NOT NULL,
    sheet_id BIGINT                NOT NULL,
    album_id BIGINT                NOT NULL
);

