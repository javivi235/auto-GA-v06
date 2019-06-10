Feature: Verificar Wallet Home

    Scenario: Verificar datos iniciales
        Given Walle page is loaded
        And browser is maximazed
        And link is redirect to: "http://localhost:8080/#/cuentas/Global"
        Then Search textfield with the account name
        And Verify if the account name is 'Global'
        Then Search the edit name button
        Then Search the Delete account button
        Then Search the title
        And  Verify title says "CUENTA:"
        Then Search Saldocuenta
        And verify saldo says "SALDO: 0"
        Then Search the Ingresos table
        Then Search the Egresos table
        Then Search the category button
        Then Search the report button
    Scenario: editar el nombre de la cuenta global
        Given Walle page is loaded
        And browser is maximazed
        And link is redirect to: "http://localhost:8080/#/cuentas/Global"
        Then Search textfield with the account name
        And Verify if the account name is 'Global'
        Then Search the edit name button
        And click edit button
        Then write the name 'Comida'
        Then Search the save name button
        And click save button
        Then search alerta superior
