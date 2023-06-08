SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-conch-22.10.0-5.1.noarch.rpm"
RPM_HASH = "cafc8788a8ccf180353107d6915848226b75dfbd08adeee156069e7eec49c91e5dc5c7db1d86901d9e02f4a7d4f85a15124ff0699630d8c7826786bab4553487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-conch"
RDEPENDS:${PN} += "python311-Twisted python311-appdirs python311-bcrypt python311-cryptography python311-pyasn1"

inherit rpm
