SUMMARY = "Convert unittest test-cases to pytest"
DESCRIPTION = "Convert unittest test-cases to pytest."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "python310-unittest2pytest-0.4-1.13.noarch.rpm"
RPM_HASH = "cd8c17fef00381a9eff9a6bab5971bda545ba8b9ec5866b57794adbafe6dcc9f68d679c9f9f5423408023eae1933b2b84c2e1a60054254300a60124c3edde44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unittest2pytest \
python3.10dist(unittest2pytest) \
python310-unittest2pytest \
python3dist(unittest2pytest)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
