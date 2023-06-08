SUMMARY = "OGC CSW server implementation written in Python"
DESCRIPTION = "PyCSW implements clause 10 (HTTP protocol binding (Catalogue Services \
for the Web, CSW)) of the OpenGIS Catalogue Service Implementation \
Specification, version 2.0.2.  The  project  is  certified  OGC \
Compliant,  and  is  an  OGC  Reference  Implementation. PyCSW allows \
for the publishing and discovery of geospatial metadata. Existing \
repositories of geospatial metadata can be exposed via OGC:CSW 2.0.2."
LICENSE = "MIT"

PV = "2.6.1"

RPM_NAME = "python310-pycsw-2.6.1-1.4.noarch.rpm"
RPM_HASH = "6b7ad0a51ace1732e04e8884ec983f30350839c6f0bad94b1029a692e8b4b000258200be7f219c49c665d153f87255496de4fc5cbaf12392fe20735825e30a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycsw python3.10dist(pycsw) python310-pycsw python3dist(pycsw)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-OWSLib python310-Shapely python310-geolinks python310-lxml python310-pyproj python310-xmltodict update-alternatives"

inherit rpm
