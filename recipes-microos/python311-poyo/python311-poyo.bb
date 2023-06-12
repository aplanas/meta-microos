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

RPM_NAME = "python311-poyo-0.5.0-2.1.noarch.rpm"
RPM_HASH = "4c95b34cbf985bee960061e7be2acfecae613012b5b56e9385f902e373249c1488e7da199d559743bf67c958058e0d24f74fba398b53d1bb77e8125e493d6593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(poyo) python311-poyo python3dist(poyo)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
