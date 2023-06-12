SUMMARY = "Fish Completion for kubernetes1.27-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.27-client."
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-client-fish-completion-1.27.1-1.2.noarch.rpm"
RPM_HASH = "f2d3898d3b1848315bdf9d31ca27b5be487f1ca85081bbb898080dba393a839d9f530f5fd911b5e91f53526b0b596ad9f3ce5647760fca5323bd8c06c0b092f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion kubernetes1.27-client-fish-completion"
RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
