SUMMARY = "The 'account' module for the Tryton ERP system"
DESCRIPTION = "The accounting module of the Tryton application platform. \
It defines fundamentals for most of accounting needs, such as fiscal year, \
period, account type, journal, tax code and more."
LICENSE = "GPL-3.0+"

PV = "6.0.15"

RPM_NAME = "trytond_account-6.0.15-1.1.noarch.rpm"
RPM_HASH = "8b1f3ba6f4bf35a1427a7ddc13213741bb77410fa04a84e6e35359ab9867bc56d3a24ea99a6a4c08822a1c615558226c995e1eb7d7931d24faf99e917f8a4bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-account) python3dist(trytond-account) trytond_account"
RDEPENDS:${PN} += "python(abi) trytond trytond_company trytond_currency trytond_party"

inherit rpm
