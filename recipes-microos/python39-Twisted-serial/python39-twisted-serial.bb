SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-serial-22.10.0-6.1.noarch.rpm"
RPM_HASH = "741fe3d213cd08ed7b5cd75f66c0492ab3eab73678c12eaf1c6182f8728e70895b6b2dfe231063e7a73bc4186317355dca8c48562931e1765dd6402d8a2a0364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-serial"
RDEPENDS:${PN} += "python39-Twisted python39-pyserial"

inherit rpm
