SUMMARY = "The 'product' module for the Tryton ERP system"
DESCRIPTION = "The Product module defines the following models in the Tryton \
application platform: Category of Unit of Measure, Unit of Measure, \
Product Template, Product and Product Category."
LICENSE = "GPL-3.0-only"

PV = "6.0.4"

RPM_NAME = "trytond_product-6.0.4-1.1.noarch.rpm"
RPM_HASH = "59dd33c43dedf42244031610da59f41ae981989331ce39a92f24d79bf55f1ecd2e9fd7e1339fe9763a2b6ba51ca93c7b36e8054bf8489351b614e41db43afc5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-product) \
python3dist(trytond-product) \
trytond_product"
RDEPENDS:${PN} += "python(abi) \
trytond"

inherit rpm
