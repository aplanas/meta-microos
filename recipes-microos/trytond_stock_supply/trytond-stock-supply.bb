SUMMARY = "The Stock Supply module for the Tryton ERP system"
DESCRIPTION = "The Stock Supply module adds automatic supply mechanisms and \
introduce the concepts of order point and purchase request into the \
Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.5"

RPM_NAME = "trytond_stock_supply-6.0.5-1.1.noarch.rpm"
RPM_HASH = "cdc810d0293cb759358b2a0e58ad1373cbb2c411936850196482654ad0a2dfdf2c0680ed98a0fb9386f68ee7e12da7e2d6e7cbf38165dd44bdf8e90022ca05f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-stock-supply) python3dist(trytond-stock-supply) trytond_stock_supply"
RDEPENDS:${PN} += "python(abi) trytond trytond_account trytond_party trytond_product trytond_purchase trytond_stock"

inherit rpm
