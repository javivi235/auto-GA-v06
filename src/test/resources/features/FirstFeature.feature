Feature: Verificar Google Home

    Scenario: Verificar si es el campo de busqueda esta visible
        Given Google page is loaded
        And browser is maximazed
        Then Search field id visible