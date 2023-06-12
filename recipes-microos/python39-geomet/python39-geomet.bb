SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-geomet-1.0.0-1.1.noarch.rpm"
RPM_HASH = "fb7ba24f4bea54347ddae0e6f3d09f524aa0dd5f4b3bebbab79274fda95f21e5223e45f12c8cb307e346ec84fa43af1b3db366bfc5b8d96e8e870dfe57d42ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(geomet) python39-geomet python3dist(geomet)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click update-alternatives"

inherit rpm
