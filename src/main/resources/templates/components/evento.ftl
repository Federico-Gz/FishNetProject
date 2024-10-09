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
        <div class="col-md-6">
            <div class="card-text shadow-lg p-2 m-2 bg-body-tertiary rounded d-flex flex-column align-items-center text-center">
                <div class="d-flex align-items-center justify-content-center mb-1">
                    <ion-icon name="caret-forward-outline" class="fs-5 me-1"></ion-icon>
                    <h6 class="mb-0">Titolo 1</h6>
                </div>
                <p class="fs-6 mb-0">Contenuto 1</p>
            </div>

            <div class="card-text shadow-lg p-2 m-2 bg-body-tertiary rounded d-flex flex-column align-items-center text-center">
                <div class="d-flex align-items-center justify-content-center mb-1">
                    <ion-icon name="caret-forward-outline" class="fs-5 me-1"></ion-icon>
                    <h6 class="mb-0">Titolo 2</h6>
                </div>
                <p class="fs-6 mb-0">Contenuto 2</p>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card-text shadow-lg p-2 m-2 bg-body-tertiary rounded d-flex flex-column align-items-center text-center">
                <div class="d-flex align-items-center justify-content-center mb-1">
                    <ion-icon name="caret-forward-outline" class="fs-5 me-1"></ion-icon>
                    <h6 class="mb-0">Titolo 3</h6>
                </div>
                <p class="fs-6 mb-0">Contenuto 3</p>
            </div>

            <div class="card-text shadow-lg p-2 m-2 bg-body-tertiary rounded d-flex flex-column align-items-center text-center">
                <div class="d-flex align-items-center justify-content-center mb-1">
                    <ion-icon name="caret-forward-outline" class="fs-5 me-1"></ion-icon>
                    <h6 class="mb-0">Titolo 4</h6>
                </div>
                <p class="fs-6 mb-0">Contenuto 4</p>
            </div>
        </div>
    </div>
    <div class="card-text shadow-lg p-3 m-3 bg-body-tertiary rounded w-50 d-flex justify-content-evenly align-items-start">
        <div class="col-md-6">
            <div class="card-text shadow-lg p-2 m-2 bg-body-tertiary rounded d-flex flex-column align-items-center text-center">
                <div class="d-flex align-items-center justify-content-center mb-1">
                    <ion-icon name="caret-forward-outline" class="fs-5 me-1"></ion-icon>
                    <h6 class="mb-0">Titolo 1</h6>
                </div>
                <p class="fs-6 mb-0">Contenuto 1</p>
            </div>

            <div class="card-text shadow-lg p-2 m-2 bg-body-tertiary rounded d-flex flex-column align-items-center text-center">
                <div class="d-flex align-items-center justify-content-center mb-1">
                    <ion-icon name="caret-forward-outline" class="fs-5 me-1"></ion-icon>
                    <h6 class="mb-0">Titolo 2</h6>
                </div>
                <p class="fs-6 mb-0">Contenuto 2</p>
            </div>
        </div>

        <div class="col-md-6">
            <div class="card-text shadow-lg p-2 m-2 bg-body-tertiary rounded d-flex flex-column align-items-center text-center">
                <div class="d-flex align-items-center justify-content-center mb-1">
                    <ion-icon name="caret-forward-outline" class="fs-5 me-1"></ion-icon>
                    <h6 class="mb-0">Titolo 3</h6>
                </div>
                <p class="fs-6 mb-0">Contenuto 3</p>
            </div>

            <div class="card-text shadow-lg p-2 m-2 bg-body-tertiary rounded d-flex flex-column align-items-center text-center">
                <div class="d-flex align-items-center justify-content-center mb-1">
                    <ion-icon name="caret-forward-outline" class="fs-5 me-1"></ion-icon>
                    <h6 class="mb-0">Titolo 4</h6>
                </div>
                <p class="fs-6 mb-0">Contenuto 4</p>
            </div>
        </div>
    </div>
</div>

       
           <div class="container d-flex justify-content-center">
            <div class="card-text  p-3 m-3 w-50 d-flex justify-content-center align-items-center fs-3 p-5">
                <button type="submit" class="btn btn-outline-info fs-4 shadow-lg ">Partecipa</button>
            </div>
        </div>
       

    </div>