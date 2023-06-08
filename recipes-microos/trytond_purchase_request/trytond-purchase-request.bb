SUMMARY = "Tryton module for purchase requests"
DESCRIPTION = "The purchase_request module of the Tryton application platform allows you to create a purchase request as pre-step for a purchase"
LICENSE = "GPL-3.0-only"

PV = "6.0.4"

RPM_NAME = "trytond_purchase_request-6.0.4-1.1.noarch.rpm"
RPM_HASH = "f1796bda5b2228150db7cfe6ca1d5de2dbc390e3ed31258432c5496157efba4b57d3ee2116867aa521440642cfc7d448f0e58c24ed75863efc5665cf21b8064d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-purchase-request) python3dist(trytond-purchase-request) trytond_purchase_request"
RDEPENDS:${PN} += "python(abi) trytond trytond_product trytond_purchase"

inherit rpm
