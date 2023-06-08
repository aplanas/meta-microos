SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-conch-22.10.0-5.1.noarch.rpm"
RPM_HASH = "47cf68f9b17944947528fc55e5d3de1d6c40734784b3668fbd08096f6c7986fe62939534feb0dc29710948ff0870618ccc5dec84ac35c493078d1d4a147981b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-conch"
RDEPENDS:${PN} += "python39-Twisted python39-appdirs python39-bcrypt python39-cryptography python39-pyasn1"

inherit rpm
