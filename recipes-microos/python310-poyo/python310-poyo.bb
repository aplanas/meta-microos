SUMMARY = "YAML Parser for Python"
DESCRIPTION = "A YAML Parser for Python. \
 \
Please note that Poyo supports only a chosen subset of the YAML format. \
 \
It can only read but not write and is not compatible with JSON. \
 \
Poyo does not allow deserialization of arbitrary Python objects. Supported \
types are str, bool, int, float, NoneType as well as dict and list values."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-poyo-0.5.0-1.14.noarch.rpm"
RPM_HASH = "416435454c618db2c9d6b2b5f263bc73d05e629db4caf280b7294e793471edd757466d405979f0e12e254cbfdb011d61e52c17df84fbed2e91438f603fdc7616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poyo python3.10dist(poyo) python310-poyo python3dist(poyo)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
