SUMMARY = "The 'purchase' module for the Tryton ERP system"
DESCRIPTION = "The purchase module defines the Purchase model in the Tryton \
application platform. The purchase is mainly defined by a party from \
which the products will be purchased and a list of purchase lines, \
each one containing a product and a quantity."
LICENSE = "GPL-3.0"

PV = "6.0.10"

RPM_NAME = "trytond_purchase-6.0.10-1.1.noarch.rpm"
RPM_HASH = "a020ca360a08cf8e18ca7ff97f0346433ae3e91e615bc6cb374f524050b4ba8bec77b69c3123cda65517025117811001e864cec5f4124f2a054b0019bc3f4155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-purchase) python3dist(trytond-purchase) trytond_purchase"
RDEPENDS:${PN} += "python(abi) trytond trytond_account trytond_account_invoice trytond_account_product trytond_company trytond_currency trytond_party trytond_product trytond_stock"

inherit rpm
