SUMMARY = "Geographic pandas extensions"
DESCRIPTION = "Geopandas combines the capabilities of pandas and shapely, providing geospatial \
operations in pandas and a high-level interface to multiple geometries to shapely. \
GeoPandas enables you to easily do operations in python that would otherwise \
require a spatial database such as PostGIS."
LICENSE = "BSD-3-Clause"

PV = "0.11.1"

RPM_NAME = "python310-geopandas-0.11.1-2.2.noarch.rpm"
RPM_HASH = "7752c82f24d4309f2d9f9eb03f997d75bcacd57156ec781f879066996ccd220a1d3d797117ff5230388d11c465ebe64d282f0594f8706a7e9e02f776150da8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geopandas python3.10dist(geopandas) python310-geopandas python3dist(geopandas)"
RDEPENDS:${PN} += "python(abi) python310-Fiona python310-pandas python310-pyproj python310-shapely"

inherit rpm
