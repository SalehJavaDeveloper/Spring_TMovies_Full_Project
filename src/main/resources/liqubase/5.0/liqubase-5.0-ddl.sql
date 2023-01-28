Create Table profile_info(
    profile_id int8 PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    admin_Name varchar(20),
    admin_Email varchar(30),
    admin_Developer varchar(50),
    admin_Profile varchar(120),
    admin_project varchar(20),
    admin_Panel varchar(20)
)