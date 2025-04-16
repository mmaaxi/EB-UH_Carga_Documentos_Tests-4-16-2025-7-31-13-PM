Feature: Validar actualización de metadatos del documento

  Scenario: Modificación y actualización de los metadatos de un documento
    Given el usuario selecciona un documento en el sistema
    When el usuario modifica los metadatos como título, descripción y etiquetas
    And guarda los cambios realizados
    Then el sistema debería mostrar los cambios actualizados 
    And debería mostrar un mensaje de "Actualización exitosa"