

function getAllData(ajaxId){
    $.ajax({
        type: 'GET',
        url: '/infoMovies/' + ajaxId,
        dataType: 'json',
        contentType:'application/json',
        success: function (result){
            var page = '<h1 id="title">'+result.tMoviesMovieName+'</h1>' +
            '<p>'+result.tMoviesMovieAbout+'</p>' +
           ' <div className="details">' +
                '<h6>A Netflix Original Film</h6>'+
                '<h5 id="gen">Thriller</h5>'+
                '<h4>2021</h4>'+
                '<h3 id="rate"><span>IMDB</span><i className="bi bi-star-fill"></i>'+result.tMoviesImdb+'</h3>'+
           '</div>'+
          '<div className="btns">'+
             '<a href="#" id="play">Watch <i className="bi bi-play-fill"></i></a>'+
                '<a href="#" id="download_main">'+
              '<i className="bi bi-cloud-arrow-down-fill">' +
                '</i ></a>'+
           '</div>'
            $('#contentInfo').html(page);
        }

    });
}