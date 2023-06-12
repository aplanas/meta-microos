SUMMARY = "Proxy for geospatial data"
DESCRIPTION = "MapProxy is an open source proxy for geospatial data. It caches, \
accelerates and transforms data from existing map services and \
serves any desktop or web GIS client."
LICENSE = "Apache-2.0"

PV = "1.15.1"

RPM_NAME = "python3-MapProxy-1.15.1-1.1.noarch.rpm"
RPM_HASH = "1f524ac3b572c1fa30b78e6aed4c4f6e6e134019169aef5c025c8c77dfa30826d07dc58cc905a0f73781f1aac3454df9814dd279f04bd01c0dac003b28963ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MapProxy \
python3.10dist(mapproxy) \
python3dist(mapproxy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
libgeos_c1 \
proj \
python(abi) \
python3-Pillow \
python3-PyYAML \
update-alternatives"

inherit rpm
