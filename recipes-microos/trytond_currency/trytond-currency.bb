SUMMARY = "The 'currency' module for the Tryton ERP system"
DESCRIPTION = "The currency module defines the concepts of currency and rate \
in the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.4"

RPM_NAME = "trytond_currency-6.0.4-1.2.noarch.rpm"
RPM_HASH = "09061ae016bb0b196ba2bd1de6861bc8e35aab9b67961625369a50bff4b7174e3a12bece8267fbac47548a9d47ae0e903454a22dd9ed47d450c578e946ef78fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-currency) python3dist(trytond-currency) trytond_currency"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) trytond"

inherit rpm
