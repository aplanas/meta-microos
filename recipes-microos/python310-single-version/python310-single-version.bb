SUMMARY = "Have a single source of version in your code base"
DESCRIPTION = "Utility to let you have a single source of version in your code base."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-single-version-1.5.1-1.10.noarch.rpm"
RPM_HASH = "c0c67c12fac46588c145ac8d96cb60db659edf45a7619d73ea20fc46f7e825cfc3ad64963df0b9ea6c7ffe2a29e0dcad8462028947bc78054a341791e6ee05a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-single-version python3.10dist(single-version) python310-single-version python3dist(single-version)"
RDEPENDS:${PN} += "python(abi) python310-first python310-importlib-metadata"

inherit rpm
