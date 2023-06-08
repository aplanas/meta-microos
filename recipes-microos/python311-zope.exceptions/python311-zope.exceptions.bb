SUMMARY = "Zope Exceptions"
DESCRIPTION = "This package contains exception interfaces and implementations which are so \
general purpose that they don't belong in Zope application-specific packages."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python311-zope.exceptions-4.6-1.3.noarch.rpm"
RPM_HASH = "c8b44ec02321ab7b61384021ab6115ad9b38e9f85d870b9738e5c711e8fad231abada1f91215a2f76750595400c9be0a3fe81f668176f091310ed35605bd4f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.exceptions) python311-zope.exceptions python3dist(zope.exceptions)"
RDEPENDS:${PN} += "python(abi) python311-zope.interface"

inherit rpm
