SUMMARY = "A library for geohash encoding, decoding and associated functions"
DESCRIPTION = "A Python library for geohash encoding, decoding and finding neighbour cells. \
This is a Python port of Chris Veness's Javascript implementation, \
https://www.movable-type.co.uk/scripts/geohash.html ."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "python310-geolib-1.0.7-2.18.noarch.rpm"
RPM_HASH = "e7dabe5f2b4812b04185ed97d1a3bdc31873dda1156929bda3c96b7fb01d64b666ebbb8f5035ef4309b0e18f816552e481cda4e9062a94e06ce9fac83bc61977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geolib \
python3.10dist(geolib) \
python310-geolib \
python3dist(geolib)"
RDEPENDS:${PN} += "python(abi) \
python310-future"

inherit rpm
