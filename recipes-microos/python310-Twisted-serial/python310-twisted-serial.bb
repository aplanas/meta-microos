SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-serial-22.10.0-5.1.noarch.rpm"
RPM_HASH = "fcfe2754d78b71cfe09c6dc067de05a4b3b54be1e7f5b5fb546d323a1feea20eca54493ba842512439445cad755d47702e21fa98082a67d8778e87ea5e42e0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-serial python310-Twisted-serial"
RDEPENDS:${PN} += "python310-Twisted python310-pyserial"

inherit rpm
