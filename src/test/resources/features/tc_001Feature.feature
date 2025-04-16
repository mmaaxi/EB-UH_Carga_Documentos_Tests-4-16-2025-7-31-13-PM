Feature: Validación de carga de documento con formato permitido

  Scenario: Subir documento con formato permitido
    Given el usuario está en la página de carga de documentos
    When selecciona un archivo con un formato permitido
    Then el nombre del archivo seleccionado es mostrado
    When hace clic en el botón 'Cargar documento'
    Then el sistema inicia la carga del documento
    And muestra el mensaje de 'Carga exitosa'
    And el documento se registra en la base de datos