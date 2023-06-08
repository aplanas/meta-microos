SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "0.2.1"

RPM_NAME = "python39-geomet-0.2.1-3.16.noarch.rpm"
RPM_HASH = "31679125edc99c5769dfa1c60ecebd93369d2a40cc372058ab5104465e4a46968459cbbbdba2b5b3579d7a8ef501bc349d54c5db2e035176494b20c25678708f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(geomet) python39-geomet python3dist(geomet)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-six update-alternatives"

inherit rpm
