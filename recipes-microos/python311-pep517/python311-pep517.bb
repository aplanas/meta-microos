SUMMARY = "Wrappers to build Python packages using PEP 517 hooks"
DESCRIPTION = "Wrappers to build Python packages using PEP 517 hooks."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-pep517-0.13.0-3.1.noarch.rpm"
RPM_HASH = "4e2cea877110d89514536a32005d63a3aaf95e674fca617f5bdd64096c9327b47e98a7b043a7839e37230142e9e4b2c404dfa9367a9c78692471bedbd078ec72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pep517) python311-pep517 python3dist(pep517)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
