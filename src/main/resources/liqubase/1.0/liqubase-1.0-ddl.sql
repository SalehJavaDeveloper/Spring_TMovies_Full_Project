CREATE Table tmoviesmain(
    Id int4 PRIMARY KEY GENERATED ALWAYS As IDENTITY,
    unique_Id int4,
    t_Movies_Logo varchar(100),
    t_Movies_Word varchar(30),
    t_Movies_Header_Image varchar(100),
    t_Movies_Main_Front_Image varchar(200),
    t_Movies_Movie_Name varchar(80),
    t_Movies_Movie_Type1 varchar(40),
    t_Movies_Movie_Type2 varchar(40),
    t_Movies_Movie_About varchar(1200),
    t_Movies_Movie_Casts varchar(40),
    t_Movies_Movie_Image1 varchar(120),
    t_Movies_Movie_Image2 varchar(120),
    t_Movies_Movie_Image3 varchar(200),
    t_Movies_Movie_Image4 varchar(200),
    t_Movies_Movie_Image5 varchar(200),
    t_Movies_Movie_Actor_Name1 varchar(50),
    t_Movies_Movie_Actor_Name2 varchar(50),
    t_Movies_Movie_Actor_Name3 varchar(50),
    t_Movies_Movie_Actor_Name4 varchar(50),
    t_Movies_Movie_Actor_Name5 varchar(50),
    t_Movies_Trailer_Video1 varchar(120),
    t_Movies_Trailer_Description1 varchar(200),
    t_Movies_Trailer_Video2 varchar(120),
    t_Movies_Trailer_Description2 varchar(200),
    t_Movies_Trailer_Video3 varchar(120),
    t_Movies_Trailer_Description3 varchar(200),
    t_Movies_Trailer_Video4 varchar(120),
    t_Movies_Trailer_Description4 varchar(200),
    t_Movies_Trailer_Video5 varchar(120),
    t_Movies_Trailer_Description5 varchar(200),
    t_Movies_Footer_Background varchar(200),
    t_Movies_Footer_Home varchar(30),
    t_Movies_Footer_Contact varchar(30),
    t_Movies_Footer_Service varchar(30),
    t_Movies_Footer_About varchar(30),
    t_Movies_Footer_Live varchar(30),
    t_Movies_Footer_Faq varchar(30),
    t_Movies_Footer_Premium varchar(30),
    t_Movies_Footer_Must_Watch varchar(30),
    t_Movies_Footer_Release varchar(30),
    t_Movies_Footer_Top_Imdb varchar(30),
    t_Movies_Imdb varchar(10)
)


--     Insert into tmovies(uniqe_id,t_movieslogo,t_moviesword,tmovies_header_image,tmovies_mainfront_image
-- 					  ,tmovies_movie_name,tmovies_movie_type1,tmovies_movie_type2,tmovies_movie_about,tmovies_movie_casts
-- 					  ,tmovies_movie_image1,tmovies_movie_image2,tmovies_movie_image3
-- 					  ,tmovies_movie_image4,tmovies_movie_image5,tmovies_movie_actorname1
-- 					  ,tmovies_movie_actorname2,tmovies_movie_actorname3,tmovies_movie_actorname4
-- 					  ,tmovies_movie_actorname5,tmovies_trailer_description1,tmovies_trailer_video1
-- 					  ,tmovies_trailer_description2,tmovies_trailer_video2
-- 					  ,tmovies_trailer_description3,tmovies_trailer_video3
-- 					  ,tmovies_trailer_description4,tmovies_trailer_video4
-- 					  ,tmovies_trailer_description5,tmovies_trailer_video5
-- 					  ,tmovies_footer_background,tmovies_footer_home,tmovies_footer_contact
-- 					  ,tmovies_footer_service,tmovies_footer_about,tmovies_footer_live
-- 					  ,tmovies_footer_faq,tmovies_footer_premium,tmovies_footer_mustwatch,tmovies_footer_release
-- 					  ,tmovies_footer_topimdb,tmovies_imdb)
-- 					  Values(1,
--                         '/image/header/tmovie.67797e94.png',
--                         'tMovies',
--                        'https://image.tmdb.org/t/p/original//VuukZLgaCrho2Ar8Scl9HtV3yD.jpg'
-- 							,'https://image.tmdb.org/t/p/original//2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg'
-- 							,'Venom',
--                             'Science Fiction',
--                             'Action',
--                             'Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.'
-- 							,'Casts',
--                              'https://image.tmdb.org/t/p/w500//yVGF9FvDxTDPhGimTbZNfghpllA.jpg'
-- 							,'https://image.tmdb.org/t/p/w500//jn3BVMVbIptz2gc6Fhxo1qwJVvW.jpg'
-- 							,'https://image.tmdb.org/t/p/w500//1uP9RaX7BGVx7XGTEmwObBJJzsC.jpg'
-- 							,'https://image.tmdb.org/t/p/w500//6cd3Jt8Vo52j8cRKbNf1j7cERhs.jpg'
-- 							,'https://image.tmdb.org/t/p/w500//kBAeDUDA7XJRXFLGNALlpE5d3lA.jpg'
-- 							,'Tom Hardy',
--                             'Michelle Williams',
--                             'Riz Ahmed',
--                             'Scott Haze',
--                             'Reid Scott',
--                             'VENOM - Extended Preview',
--                             'https://www.youtube.com/embed/Worz_qCsYvU'
-- 							,'VENOM: SPECIAL FEATURES CLIP Designing Venom',
--                              'https://www.youtube.com/embed/BaVa3myLuWk',
--                              'VENOM Clip - Rock Out With Your Brock Out'
-- 							,'https://www.youtube.com/embed/_4B3KgPtwCY',
--                              'VENOM Clip - To Protect and Sever',
--                               'https://www.youtube.com/embed/EDbIgO70hKo'
-- 							,'VENOM – ESPN Promo New Mascot',
--                              'https://www.youtube.com/embed/7DA9-ROw-PI'
-- 							,'/image/footer/footer-bg.67e95f05.jpg'
-- 							,'Home','Contact us','Term of services','About us'
-- 							,'Live','FAQ','Premium',
-- 'You must watch','Recent releasei','Top IMDB','6.8')
