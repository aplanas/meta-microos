SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.0"

RPM_NAME = "python310-DataProperty-0.55.0-2.3.noarch.rpm"
RPM_HASH = "a98c3ef6d4f15ec844ef1988c296c8cd979ce00c63836031bbdb22c2b5d17efed94c653a530c9d2248f5c65790b308abe8fefa099a11cae8919b414cec820357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DataProperty python3.10dist(dataproperty) python310-DataProperty python3dist(dataproperty)"
RDEPENDS:${PN} += "python(abi) python310-mbstrdecoder python310-typepy"

inherit rpm
