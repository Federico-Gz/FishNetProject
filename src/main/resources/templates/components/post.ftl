<div class="card d-flex container w-100" data-post-id="1">
    <div class="container bg-body-tertiary">
        <div class="container-fluid d-flex justify-content-between align-items-start">
            <div class="d-flex w-50">
                <img src="/img/logo.png" alt="Logo" class="d-flex align-self-center img-profilo" />
                <div class="d-flex flex-column align-self-center mt-3">
                    <h6 class="align-self-center">${post.getUtente().getUsername()}</h6>
                    <p class="align-self-center">${post.getFormattedDataOra()}</p>
                </div>
                
                </div>
	            <div class="btn-group dropend">
	                      <button type="button" class="btn bg-transparent border border-0 text-body m-3 " data-bs-toggle="dropdown" aria-expanded="false">
	                        <a href="#" class="align-self-start p-3">
	                            <ion-icon name="ellipsis-vertical-outline" class="" size=""></ion-icon>
	                        </a>
	                      </button>
	                      <ul class="dropdown-menu">
	                        <li><a class="dropdown-item" href="#">Modifica</a></li>
	                        <li><a class="dropdown-item" href="#">Rimuovi</a></li>
	                      </ul>
	                </div>
        </div>
    </div>

    <div class="d-flex justify-content-center">
        <img src="../uploads/post/${post.getImg()}" class="card-img-top w-100 p-3"/>
    </div>

    <div class="card-body">
        <p class="card-text">
           <!-- recupera la descrizione di ogni post presente in listaPost -->
            
                      ${post.getDescrizione()}
            
       
            <!--This is a wider card with supporting text below as a natural lead-in
            to additional content. This content is a little bit longer.-->
        </p>
        <div class="container d-flex justify-content-center align-items-center">
			 <form action="addInteraction" method="post" class="d-flex justify-content-center align-items-center" >
	            <p class="like-counter m-0" id="like-counter-1">0</p>
	            <input type="hidden" name="id_post" value="${post.getIdPost()}">
	            <button type="submit" name="action" value="like" class="navbar-brand button" id="like-button-${post.getIdPost()}" style="padding: 1px;">
	                <img src="../img/like.png" width="60" height="50">
	            </button>

	            <button type="submit" name="action" value="dislike" class="navbar-brand button" id="dislike-button-${post.getIdPost()}" data-post-id="1" style="padding: 1px;">
	                <img src="../img/notLike.png" width="60" height="50">
	            </button>
	
	            <p class="like-counter m-0" id="dislike-counter-1">0</p>
           	</form>
        </div>
    </div>
</div>

 