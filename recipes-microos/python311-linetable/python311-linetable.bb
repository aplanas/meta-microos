SUMMARY = "library to manage Python Locations Table (co_linetable)"
DESCRIPTION = "library to manage Python Locations Table (co_linetable)"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-linetable-0.0.3-1.2.noarch.rpm"
RPM_HASH = "a60dcf6e8ec1d7f47c74330502a6c0fe0313e21d1a235654f482a81ef6da57fea7aafaf6368658f0a2416a503336b893ee7628cdaca3c2f9c7e51f28e4af8f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(linetable) \
python311-linetable \
python3dist(linetable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
