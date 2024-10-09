<div class="card d-flex container w-100">
        <div class="container bg-body-tertiary">
            <div class="container-fluid d-flex justify-content-between align-items-start">
                <div class="d-flex w-50">
                    <img src="/img/immagine-utente.png" alt="Immagine Utente"
                        class="d-flex align-self-center img-profilo" />
                    <div class="d-flex flex-column align-self-center mt-3">
                        <h6 class="align-self-center fs-5">${evento.getUtente().getUsername()}</h6>
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

        <div class="card-body shadow-lg mt-3 border shadow-sm p-3 bg-body-tertiary rounded">
            <p class="card-text fs-3">
                ${evento.getDescrizione()}
            </p>

        </div>

        <div class="container d-flex mt-5">
    		<div class="card-text shadow-lg p-3 m-3 bg-body-tertiary rounded w-50 d-flex justify-content-evenly align-items-start">
        		<ul class="w-50 d-flex flex-column align-items-center ps-0">
        			<li class="m-0 mt-4">
        				<div class="d-flex align-items-center justify-content-center">
    						<ion-icon name="caret-forward-outline" class="fs-5"></ion-icon>
    						<p class="mb-0 ms-4 fs-3">ciao</p>
						</div>
            		</li>
            		<li class="m-0 mt-4">
        				<div class="d-flex align-items-center justify-content-center">
    						<ion-icon name="caret-forward-outline" class="fs-5"></ion-icon>
    						<p class="mb-0 ms-4 fs-3">ciao</p>
						</div>
            		</li>
        		</ul>
        		<ul class="w-50 d-flex flex-column align-items-center ps-0">
        			<li class="m-0 mt-4">
        				<div class="d-flex align-items-center justify-content-center">
    						<ion-icon name="caret-forward-outline" class="fs-5"></ion-icon>
    						<p class="mb-0 ms-4 fs-3">ciao</p>
						</div>
            		</li>
            		<li class="m-0 mt-4">
        				<div class="d-flex align-items-center justify-content-center">
        					<ion-icon name="caret-forward-outline" class="fs-5"></ion-icon>
    						<p class="mb-0 ms-4 fs-3">ciao</p>
						</div>
            		</li>
        		</ul>
    		</div>
    		<div class="card-text shadow-lg p-3 m-3 bg-body-tertiary rounded w-50 d-flex justify-content-evenly align-items-start">
        		<ul class="w-50 d-flex flex-column align-items-center ps-0">
        			<li class="m-0 mt-4">
        				<div class="d-flex align-items-center justify-content-center">
    						<ion-icon name="caret-forward-outline" class="fs-5"></ion-icon>
    						<p class="mb-0 ms-4 fs-3">ciao</p>
						</div>
            		</li>
            		<li class="m-0 mt-4">
        				<div class="d-flex align-items-center justify-content-center">
    						<ion-icon name="caret-forward-outline" class="fs-5"></ion-icon>
    						<p class="mb-0 ms-4 fs-3">ciao</p>
						</div>
            		</li>
        		</ul>
        		<ul class="w-50 d-flex flex-column align-items-center ps-0">
        			<li class="m-0 mt-4">
        				<div class="d-flex align-items-center justify-content-center">
    						<ion-icon name="caret-forward-outline" class="fs-5"></ion-icon>
    						<p class="mb-0 ms-4 fs-3">ciao</p>
						</div>
            		</li>
            		<li class="m-0 mt-4">
        				<div class="d-flex align-items-center justify-content-center">
        					<ion-icon name="caret-forward-outline" class="fs-5"></ion-icon>
    						<p class="mb-0 ms-4 fs-3">ciao</p>
						</div>
            		</li>
        		</ul>
    		</div>
		</div>

        <div class="container d-flex justify-content-center">
            <div class="card-text shadow-lg p-2 shadow-sm p-3 m-3 bg-body-tertiary rounded w-50 d-flex justify-content-center align-items-center fs-3 p-5">
                <p class="like-counter m-0" id="like-counter">0</p>
                <a class="navbar-brand button" id="like-button" href="#" style="padding: 1px;">
                    <img src="/img/like.png" width="60" height="50">
                </a>
                <a class="navbar-brand button" id="dislike-button" href="#" style="padding: 1px;">
                    <img src="/img/notLike.png" width="60" height="50">
                </a>
                <p class="like-counter m-0" id="dislike-counter">0</p>
            </div>
        </div>

    </div>