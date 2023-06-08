SUMMARY = "Constants used in Chinese text processing"
DESCRIPTION = "Zhon provides constants used in Chinese text processing."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python39-zhon-1.1.5-4.1.noarch.rpm"
RPM_HASH = "b252d401541a0fc8427f5889f21e310f8afd0da36a9fd7999cdeec2708b2fdc85e534ac177e221df197dc417925f5a80677abbe4618d54c0ede98f98ddcbfd9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zhon) python39-zhon python3dist(zhon)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
