Feature: Validar eliminación de un documento

  Scenario: Eliminar un documento de la lista de documentos cargados
    Given que un documento está cargado en la lista
    When selecciono un documento
    And hago clic en el botón 'Eliminar'
    And confirmo la eliminación
    Then el documento desaparece de la lista
    And veo un mensaje de 'Eliminación exitosa'