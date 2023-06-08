SUMMARY = "A collection of plugins for xviewer"
DESCRIPTION = "This package contains plugins for additional features in xviewer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugins-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "34a50174f1be206b3c87f75f89225026601ef33a38e645dd7beb569445f4f68a3c34c97a535505f1fff9cbf51b5776b46805dd8498fa4349b15b54d454aec413"

RPROVIDES:${PN} += "xviewer-plugins xviewer-plugins(aarch-64)"
RDEPENDS:${PN} += "xviewer"

inherit rpm
