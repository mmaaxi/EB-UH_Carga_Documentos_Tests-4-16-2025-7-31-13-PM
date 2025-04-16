Feature: Validar acceso restringido a documentos sensibles

  Scenario: Usuario sin permisos intenta acceder a documentos sensibles
    Given El usuario está autenticado en el sistema sin permisos para documentos sensibles
    When El usuario intenta visualizar un documento marcado como sensible
    Then El sistema limita el acceso a documentos sensibles
    And Aparece un mensaje de 'Acceso Denegado'