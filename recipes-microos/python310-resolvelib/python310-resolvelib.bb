SUMMARY = "Module to resolve abstract dependencies into concrete ones"
DESCRIPTION = "A Python module to resolve abstract dependencies into concrete ones."
LICENSE = "ISC"

PV = "0.8.1"

RPM_NAME = "python310-resolvelib-0.8.1-7.1.noarch.rpm"
RPM_HASH = "2cac7acc09565a3f86d6358da5a56305d78d17ba3849d7264ad45ffbec7aa27cf878f4504484500d309ab39a1eb15f86e38271b5f738c04f9988f66904c75a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resolvelib python3.10dist(resolvelib) python310-resolvelib python3dist(resolvelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
