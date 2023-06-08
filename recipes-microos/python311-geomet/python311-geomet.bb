SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "0.2.1"

RPM_NAME = "python311-geomet-0.2.1-3.16.noarch.rpm"
RPM_HASH = "b0c6c0b7c91f24403a04abe169220881051beb1ca247e7095387b30fb16c3b40fd071e4ca13a21a12dc17b3a548ba235148d3051b47625ee9b6320bbde946e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(geomet) python311-geomet python3dist(geomet)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-click python311-six update-alternatives"

inherit rpm
