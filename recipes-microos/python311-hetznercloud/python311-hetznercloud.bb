SUMMARY = "Hetzner Cloud SDK"
DESCRIPTION = "A Python 3 SDK for the Hetzner cloud service."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-hetznercloud-1.1.1-3.11.noarch.rpm"
RPM_HASH = "18e21af3075f696483e3e6203ec1232430f0521fa2a6b49053e29820a8cb4fc0066361711df4d8cd01a481183fd508df5150dbce8b0f7b2f9b7c1994ac07b955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hetznercloud) python311-hetznercloud python3dist(hetznercloud)"
RDEPENDS:${PN} += "python(abi) python311-requests"

inherit rpm
