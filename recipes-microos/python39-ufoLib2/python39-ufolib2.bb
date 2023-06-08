SUMMARY = "UFO font processing library"
DESCRIPTION = "ufoLib2 is a UFO font processing library."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python39-ufoLib2-0.13.1-1.3.noarch.rpm"
RPM_HASH = "dd6d791a5e63fe2028a99b2c6d7cc675321cc52eaa85d49f6bf2f198b48fb1080a22de56a1edc32a154af764a7d703fdaf4ebe5b256bd3b3afb919804d339cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ufolib2) python39-ufoLib2 python3dist(ufolib2)"
RDEPENDS:${PN} += "python(abi) python39-FontTools python39-attrs python39-fs"

inherit rpm
