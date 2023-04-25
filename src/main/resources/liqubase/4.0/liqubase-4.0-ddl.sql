CREATE TABLE usermaindetail(
    user_id int8 PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    username varchar(500),
    password varchar(500),
    role varchar(50)
)