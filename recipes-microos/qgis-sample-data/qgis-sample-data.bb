SUMMARY = "QGIS sample data"
DESCRIPTION = "QGIS sample data with raster, vector, gps files and a GRASS location from the Alaska area."
LICENSE = "GPL-2.0-only"

PV = "3.30.1"

RPM_NAME = "qgis-sample-data-3.30.1-3.1.noarch.rpm"
RPM_HASH = "f218cdce19142e4dede56dc85112d759c8a0f121af07b5d7bfc886065c59d05d7864cbbc2d08385bddb9617a31721bc7b654fca867e7aa1e2945c1428d2a46e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qgis-sample-data"
RDEPENDS:${PN} += ""

inherit rpm
