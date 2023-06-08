SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python311-gwosc-0.6.1-2.4.noarch.rpm"
RPM_HASH = "59c4cda46e468ec9dc292adc300e1ab9d14ce27947d75ab9859b63247187cc3c754450ddc46a4907608c3d7b9043f3ebd1a708950504f31882d3539e7961bfbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gwosc) python311-gwosc python3dist(gwosc)"
RDEPENDS:${PN} += "python(abi) python311-requests"

inherit rpm
