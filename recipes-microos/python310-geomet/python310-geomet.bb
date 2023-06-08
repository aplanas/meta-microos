SUMMARY = "GeoJSON <-> WKT/WKB conversion utilities"
DESCRIPTION = "GeoJSON <-> WKT/WKB conversion utilities"
LICENSE = "Apache-2.0"

PV = "0.2.1"

RPM_NAME = "python310-geomet-0.2.1-3.16.noarch.rpm"
RPM_HASH = "451da5b0f0306d8498509c5e2d2f9708b5a019b26928a49e64d53eaf0c47e9e5f813fda4e29169a5aef4ab547e822487a0d34d6d475cb9e3d7aa2b1e51ec473b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geomet python3.10dist(geomet) python310-geomet python3dist(geomet)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-click python310-six update-alternatives"

inherit rpm
