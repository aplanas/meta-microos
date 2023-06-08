SUMMARY = "Eric API files for python310-qtcharts-qt5"
DESCRIPTION = "This package provides Qt5 Charts library API files for the Eric IDE."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtcharts-qt5-api-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "ea8a24e6e6c5ca3175d1c9fbb3d29ec811d53e529b09815428402bbc58c414de539becf4b7fea5ca811ded4fce1f4e7483dcdeead8d9e59cf464af0447fac6b7"

RPROVIDES:${PN} += "python3-qtcharts-qt5-api python310-qtcharts-qt5-api python310-qtcharts-qt5-api(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
