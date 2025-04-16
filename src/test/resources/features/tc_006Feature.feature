Feature: Recuperación de documento eliminado

  Scenario: Validar función de recuperación de documento eliminado
    Given el usuario está autenticado y navega a la sección de documentos eliminados
    When el usuario selecciona un documento eliminado
    And el usuario hace clic en el botón 'Recuperar'
    Then el documento se restaura a la lista principal y se muestra mensaje de éxito