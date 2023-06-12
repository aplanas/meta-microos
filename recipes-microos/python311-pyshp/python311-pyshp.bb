SUMMARY = "Python library for ESRI Shapefile format"
DESCRIPTION = "PySHP provides Python read/write support for the ESRI Shapefile \
geospatial vector data format."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-pyshp-2.1.0-1.14.noarch.rpm"
RPM_HASH = "d0404a651be9e48500ff422e0e0e9cef2e8245b74e6b05ae5d115379c5aafdcf6fb9af1ce0dc669cef0354ce7b1f51ef597068497a28a99895d167afd5036281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyshp) \
python311-pyshp \
python3dist(pyshp)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
