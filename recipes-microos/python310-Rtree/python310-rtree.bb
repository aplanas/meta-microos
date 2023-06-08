SUMMARY = "R-Tree spatial index for Python GIS"
DESCRIPTION = "A ctypes Python wrapper of libspatialindex that provides a number of advanced \
spatial indexing features for the spatially curious Python user. \
 \
* Nearest neighbor search \
* Intersection search \
* Multi-dimensional indexes \
* Clustered indexes (store Python pickles directly with index entries) \
* Bulk loading \
* Deletion \
* Disk serialization \
* Custom storage implementation (to implement spatial indexing in ZODB, \
  for example)"
LICENSE = "MIT"

PV = "0.9.7"

RPM_NAME = "python310-Rtree-0.9.7-1.7.noarch.rpm"
RPM_HASH = "8f3c58d5a6adc122d781d5fb65631c7ce25ae7c05a572fc93ea5d5514d18160dec1b0af49205cade546a051c052959863be1ce94b417ed29330a205119acefb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Rtree python3-rtree python3.10dist(rtree) python310-Rtree python310-rtree python3dist(rtree)"
RDEPENDS:${PN} += "libspatialindex6 python(abi)"

inherit rpm
