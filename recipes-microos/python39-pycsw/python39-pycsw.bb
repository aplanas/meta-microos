SUMMARY = "OGC CSW server implementation written in Python"
DESCRIPTION = "PyCSW implements clause 10 (HTTP protocol binding (Catalogue Services \
for the Web, CSW)) of the OpenGIS Catalogue Service Implementation \
Specification, version 2.0.2.  The  project  is  certified  OGC \
Compliant,  and  is  an  OGC  Reference  Implementation. PyCSW allows \
for the publishing and discovery of geospatial metadata. Existing \
repositories of geospatial metadata can be exposed via OGC:CSW 2.0.2."
LICENSE = "MIT"

PV = "2.6.1"

RPM_NAME = "python39-pycsw-2.6.1-1.4.noarch.rpm"
RPM_HASH = "52e72df83f6a21d2bbc473ea49152d2be5405f7a16fad13c488b14d0362f6b4bd3c154fb246c84e91d670b46e3200a8c67eeabb883ffc471c928f701dee21e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pycsw) \
python39-pycsw \
python3dist(pycsw)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-OWSLib \
python39-Shapely \
python39-geolinks \
python39-lxml \
python39-pyproj \
python39-xmltodict \
update-alternatives"

inherit rpm
