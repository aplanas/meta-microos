SUMMARY = "Python 2 / 3 compatibility, like six, but favouring Python 3"
DESCRIPTION = "python-nine is python-six 'turned around': whereas python-six used \
to make python2 idioms work in python3, python-nine makes python3 \
idioms work in python2."
LICENSE = "SUSE-Public-Domain"

PV = "1.1.0"

RPM_NAME = "python39-nine-1.1.0-1.13.noarch.rpm"
RPM_HASH = "41a1e3a41ade0fdb4c9eaf4e4ab25cdeedd988350d7b95cd388d78eea4f9b0e5a060042311efd6948ac9342af2e2199bdb3d36b77effa46edd3b3db7c578d75f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nine) \
python39-nine \
python3dist(nine)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
