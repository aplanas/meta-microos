SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-gwosc-0.7.1-1.1.noarch.rpm"
RPM_HASH = "e6af3b1b3d5090888141c8375a94b9afea00d6e755aa244392342eeb4733b1feeda5eeecbf81a5ea9d5ccb55fce135855fcaf54e08c66aad8f938fcb699f72f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gwosc) \
python311-gwosc \
python3dist(gwosc)"
RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
