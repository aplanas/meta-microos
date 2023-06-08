SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-conch-22.10.0-5.1.noarch.rpm"
RPM_HASH = "8b2d0ecab30876c1c4283f93ba4ebd351ea5382f847098b9f3f2d7344f2550375f487c103872d01e7a178137706bc6c54fb021b0056bf0fe737161c7b8270748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch python310-Twisted-conch"
RDEPENDS:${PN} += "python310-Twisted python310-appdirs python310-bcrypt python310-cryptography python310-pyasn1"

inherit rpm
