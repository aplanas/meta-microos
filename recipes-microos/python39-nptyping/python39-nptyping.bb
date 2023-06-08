SUMMARY = "Type hints for NumPy"
DESCRIPTION = "Type hints for NumPy."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "python39-nptyping-2.4.1-1.3.noarch.rpm"
RPM_HASH = "e79241e83895065c1158ad30d4d6660d57f0165901c679afb671ca26b9b0dc614808927796fe8689f9a4d25d14c9c08435add37bc74dac3fc149bd6591e60b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nptyping) python39-nptyping python3dist(nptyping)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-typing_extensions"

inherit rpm
