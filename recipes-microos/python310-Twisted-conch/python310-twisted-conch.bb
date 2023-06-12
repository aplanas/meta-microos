SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-conch-22.10.0-6.1.noarch.rpm"
RPM_HASH = "7a05525eba8a813d1443fdfe3bbe256ae74169f12e16940c18c6c925c3a8cf13cf23d1b19e150db3ab890690abdaae0999c59477867c78fb99a9bc2530ce9ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch python310-Twisted-conch"
RDEPENDS:${PN} += "python310-Twisted python310-appdirs python310-bcrypt python310-cryptography python310-pyasn1"

inherit rpm
