SUMMARY = "A library for geohash encoding, decoding and associated functions"
DESCRIPTION = "A Python library for geohash encoding, decoding and finding neighbour cells. \
This is a Python port of Chris Veness's Javascript implementation, \
https://www.movable-type.co.uk/scripts/geohash.html ."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python39-geolib-1.0.7-2.18.noarch.rpm"
RPM_HASH = "b9e2ed9177bb4bc55a357573323e5231c69e73531266ad05c2e1ed5d9789e8ca21a99de2978c9730c3baa4c6c8239792746501d55760b6e98553b2be333c11fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(geolib) \
python39-geolib \
python3dist(geolib)"
RDEPENDS:${PN} += "python(abi) \
python39-future"

inherit rpm
