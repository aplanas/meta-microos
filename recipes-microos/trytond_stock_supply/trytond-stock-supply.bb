SUMMARY = "The Stock Supply module for the Tryton ERP system"
DESCRIPTION = "The Stock Supply module adds automatic supply mechanisms and \
introduce the concepts of order point and purchase request into the \
Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.6"

RPM_NAME = "trytond_stock_supply-6.0.6-1.1.noarch.rpm"
RPM_HASH = "de8f6d6f064224163bd02dcfe4bcbe666f177bfb0b19c7e5e3a1c46ae97c0ff326721b01d4c9256ef3e0a111abe11d260ea7089bcb218b26fc2951ee332a24c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-stock-supply) \
python3dist(trytond-stock-supply) \
trytond_stock_supply"
RDEPENDS:${PN} += "python(abi) \
trytond \
trytond_account \
trytond_party \
trytond_product \
trytond_purchase \
trytond_stock"

inherit rpm
