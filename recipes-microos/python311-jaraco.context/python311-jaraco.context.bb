SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python311-jaraco.context-4.3.0-1.1.noarch.rpm"
RPM_HASH = "49a1bf8002c56308c9aae7a7b0d7080b5a852950794fe9058402821b1438c65e1f61c1350060e177c243ef3c305dc147f855db51d7e38485e6b75ef369661df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.context) \
python311-jaraco.context \
python3dist(jaraco.context)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
