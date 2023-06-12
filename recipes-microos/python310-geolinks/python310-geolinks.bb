SUMMARY = "Utilities to deal with geospatial links"
DESCRIPTION = "Python implementation of Cat-Interop utilities for geospatial links."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-geolinks-0.2.0-1.14.noarch.rpm"
RPM_HASH = "791024209c6d0bf307d59ad4949e5566787ae599292dbbcbd325ad8ff843f269a8362ef7315fe187ea8265551c36c92094d2144dddb50efb456387d6b62d595b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geolinks \
python3.10dist(geolinks) \
python310-geolinks \
python3dist(geolinks)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
