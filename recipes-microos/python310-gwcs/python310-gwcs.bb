SUMMARY = "Generalized World Coordinate System"
DESCRIPTION = "An Astropy affiliated package providing tools for managing the \
World Coordinate System of astronomical data."
LICENSE = "BSD-3-Clause"

PV = "0.18.3"

RPM_NAME = "python310-gwcs-0.18.3-1.3.noarch.rpm"
RPM_HASH = "aa54e775e8d4660704273d89d8fbce7c6407909151ad33bd0435b34674984ea2d56575310aebc990e69503bd728cb8e4321176a3ae904fa853bccd9d0cb27b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwcs \
python3.10dist(gwcs) \
python310-gwcs \
python3dist(gwcs)"
RDEPENDS:${PN} += "python(abi) \
python310-asdf \
python310-asdf-astropy \
python310-asdf_wcs_schemas \
python310-astropy \
python310-numpy \
python310-scipy"

inherit rpm
