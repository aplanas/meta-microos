SUMMARY = "Python unittest Utilities"
DESCRIPTION = "Python unittest Utilities."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python39-case-1.5.3-7.3.noarch.rpm"
RPM_HASH = "b407dac899f93da5e1d32c4b78a8ce7759e6f1df9d38e9c5674e1044a861c0e4780a0ce2c55b782cb079705edfcc1151a8f55d02f04bfcd821a2d8f0b28841f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(case) python39-case python3dist(case)"
RDEPENDS:${PN} += "python(abi) python39-pytest python39-setuptools python39-six"

inherit rpm
