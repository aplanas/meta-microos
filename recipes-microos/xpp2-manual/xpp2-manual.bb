SUMMARY = "XML Pull Parser"
DESCRIPTION = "XML Pull Parser 2 (XPP2) is a simple and fast incremental XML parser. \
NOTE: XPP2 is no longer developed and is on maintenance mode. All \
active development concentrates on its successor XPP3/MXP1"
LICENSE = "Apache-1.1"

PV = "2.1.10"

RPM_NAME = "xpp2-manual-2.1.10-30.6.noarch.rpm"
RPM_HASH = "908acfe28ee40fe6fb00c4627400245c53678dea079b88bfbe3497b3e428eec389ea422403e535853e44f7313a770a3c95e629ca7d30bf2ece42fbb65d0e2005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp2-manual"
RDEPENDS:${PN} += ""

inherit rpm
