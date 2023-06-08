SUMMARY = "Development Libraries for QGIS"
DESCRIPTION = "Development packages for QGIS, including the C header files."
LICENSE = "GPL-2.0-only"

PV = "3.30.1"

RPM_NAME = "qgis-devel-3.30.1-3.1.aarch64.rpm"
RPM_HASH = "1c46fd5c2d2dda8d01f82194e307d57379803e9198547d802a0b49a43a6823c0b56cdd0a081254357bcf351b3815abe8688fa0a55b33538b57d4d6bbf0428137"

RPROVIDES:${PN} += "qgis-devel qgis-devel(aarch-64)"
RDEPENDS:${PN} += "python3-qt5-devel qgis"

inherit rpm
