Create Table shoppingcard(
    id int8 PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    t_Movies_Main_Front_Image varchar(200),
    t_Movies_Movie_Name varchar(80),
    t_Movies_Imdb varchar(10),
    movie_Id int8
)