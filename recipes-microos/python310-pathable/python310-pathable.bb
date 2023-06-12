SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python310-pathable-0.4.3-3.1.noarch.rpm"
RPM_HASH = "951d245beb1de6c8eb634d889cb624035779ef287a446b43396813b545efa786923b65a35a6b7d58265f28e707363a8606e5887a5ebd4436f3f136a2a30af667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictpath \
python3-pathable \
python3.10dist(pathable) \
python310-dictpath \
python310-pathable \
python3dist(pathable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
