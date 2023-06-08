SUMMARY = "The 'country' module for the Tryton ERP system"
DESCRIPTION = "The country module defines the concepts of country and subdivision in \
the Tryton application platform. The module comes preloaded with the \
ISO 3166 list of countries and subdivisions thanks to the pycountry \
module."
LICENSE = "GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "trytond_country-6.0.3-1.2.noarch.rpm"
RPM_HASH = "c312773d104ea5083b0ac39b1abe695bee00a980f30e4f1355e077a773b5353b3d0a632df82b434f43d88bcc42d653965689ac7130b80d050c114d220219aa19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-country) python3dist(trytond-country) trytond_country"
RDEPENDS:${PN} += "/usr/bin/python3 proteus python(abi) python3-pycountry trytond"

inherit rpm
