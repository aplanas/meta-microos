SUMMARY = "The 'account_invoice' module for the Tryton ERP system"
DESCRIPTION = "The account_invoice module add invoices and payment terms."
LICENSE = "GPL-3.0-only"

PV = "6.0.10"

RPM_NAME = "trytond_account_invoice-6.0.10-1.1.noarch.rpm"
RPM_HASH = "1eda9c9f65694ad296c0bad414eaf4bcba9c1dff5bb28af5ef148f6456794053d5faf398d3069587c8cb8df2b504092ada6b9e9be8ff13c4433e5c74074b0e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-account-invoice) python3dist(trytond-account-invoice) trytond_account_invoice"
RDEPENDS:${PN} += "python(abi) python3-dateutil trytond trytond_account trytond_account_product trytond_company trytond_currency trytond_party trytond_product"

inherit rpm
