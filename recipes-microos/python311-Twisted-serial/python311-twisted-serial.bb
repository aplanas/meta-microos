SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-serial-22.10.0-5.1.noarch.rpm"
RPM_HASH = "1a7372311cb4f62dd5ff4fa18258b217230451ffced30617b7fa03308fa5a466e41223f39f725084b5b00283a0652cea35e0b7c858b432262e46d67af50498b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-serial"
RDEPENDS:${PN} += "python311-Twisted python311-pyserial"

inherit rpm
