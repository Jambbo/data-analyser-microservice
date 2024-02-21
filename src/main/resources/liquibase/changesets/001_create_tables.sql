CREATE TABLE data
(
    id          BIGSERIAL PRIMARY KEY, --BIGSERIAL необходим для того чтоб сохранялось его значение и потом последовательно инкрементировалось
    sensor_id    BIGINT    NOT NULL,
    timestamp   timestamp NOT NULL,
    measurement FLOAT     NOT NULL,
    type        VARCHAR   NOT NULL
);