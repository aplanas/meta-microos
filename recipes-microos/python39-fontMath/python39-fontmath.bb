SUMMARY = "A set of objects for performing math operations on font data"
DESCRIPTION = "A set of objects for performing math operations on font data."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python39-fontMath-0.9.3-1.3.noarch.rpm"
RPM_HASH = "e10735af736bc31af943c4773341d494e01abdeaf31a705c029c1954734cdc9c7d87848429eb0f8d187aaa12b851cc8b6c1154660b15b3abe951e0907239e0a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fontmath) \
python39-fontMath \
python3dist(fontmath)"
RDEPENDS:${PN} += "python(abi) \
python39-FontTools"

inherit rpm
