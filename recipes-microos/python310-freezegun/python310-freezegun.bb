SUMMARY = "Mock time date for Python"
DESCRIPTION = "FreezeGun is a library that allows your python tests to travel through \
time by mocking the datetime module."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python310-freezegun-1.2.2-2.1.noarch.rpm"
RPM_HASH = "056a38e2d36bbd52e71cf8faab01e498e709d006fceb5035dbd47f28b8e99620a214bd0ddf728b4cf8403716e859dc63762b47d426c2523a0738acb226e8d150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freezegun python3.10dist(freezegun) python310-freezegun python3dist(freezegun)"
RDEPENDS:${PN} += "python(abi) python310 python310-python-dateutil"

inherit rpm
