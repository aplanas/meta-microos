SUMMARY = "Hierarchical repository abstraction layer"
DESCRIPTION = "LibRepository provides a simple abstraction layer to access bulk content that \
is organized in a hierarchical layer."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "librepository-1.1.6-1.4.noarch.rpm"
RPM_HASH = "efc91981d15f8e1ba5abbb669320e132fecd89d338cdcac6777aa2fa77f7700997dfc389ea00102503abaf83635057f896fb568925a0e9948282a5e98d009bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librepository"
RDEPENDS:${PN} += "java jpackage-utils libbase"

inherit rpm
