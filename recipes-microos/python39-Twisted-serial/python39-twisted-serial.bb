SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-serial-22.10.0-5.1.noarch.rpm"
RPM_HASH = "639729726c1694df44a82dd568e582bcd398c71d51fb609d980c08ab85b6f0948a720579f78de176b2f12a01b99e3df7c7dd80b22ff0da167a28d144ce4d0b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-serial"
RDEPENDS:${PN} += "python39-Twisted python39-pyserial"

inherit rpm
