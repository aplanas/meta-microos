SUMMARY = "Python L20n library"
DESCRIPTION = "L20n mozilla markings for translations. \
 \
Better solution today is to use python fluent module."
LICENSE = "Apache-2.0"

PV = "4.0.0a1"

RPM_NAME = "python311-l20n-4.0.0a1-2.3.noarch.rpm"
RPM_HASH = "ea6e8eca3474a30ef5f892e1d32919d4a3504d8e8b1b6f24beb314d94ca9c890fb8561620473a49e0969a93a4ad5c14c8c5498e109d5d617e218404e69cbc846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(l20n) python311-l20n python3dist(l20n)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
