SUMMARY = "XML Pull Parser"
DESCRIPTION = "XML Pull Parser 2 (XPP2) is a simple and fast incremental XML parser. \
NOTE: XPP2 is no longer developed and is on maintenance mode. All \
active development concentrates on its successor XPP3/MXP1"
LICENSE = "Apache-1.1"

PV = "2.1.10"

RPM_NAME = "xpp2-demo-2.1.10-30.6.noarch.rpm"
RPM_HASH = "b654c56f93a4d6a7148ba52f1d137d472c885834704e1b0cea4e6422cc195264a106986d0f83381ed1a4def0eb7508e52706aa83e54a6920ed2f94c810ff018e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp2-demo"
RDEPENDS:${PN} += "xpp2"

inherit rpm
