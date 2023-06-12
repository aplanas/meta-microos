SUMMARY = "A dot-accessible dictionary"
DESCRIPTION = "A dot-accessible dictionary (a la JavaScript objects)."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-munch-2.5.0-2.1.noarch.rpm"
RPM_HASH = "258c0ecbccb40e1a95d4feeb63c5435f90f4877c8036a3d235ffd0f8eb81e1991d49d7a1d6c5eac9409d01f65b57d2dea4c9865334f8180c99acdd60e4fcd7da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(munch) \
python311-munch \
python3dist(munch)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
