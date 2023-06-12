SUMMARY = "A screenshot Python module"
DESCRIPTION = "PyScreeze is a screenshot module for Python 2 and 3."
LICENSE = "BSD-3-Clause"

PV = "0.1.28"

RPM_NAME = "python310-PyScreeze-0.1.28-1.3.noarch.rpm"
RPM_HASH = "2584af6d3d3df9bc0ed1f7ec6596f88d564c8bc0abe76a6dfc20b72c47c3765f15d8a99cc8838fad7d2f147de600e03311901cda2d80573107e6a66137ce39e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyScreeze \
python3.10dist(pyscreeze) \
python310-PyScreeze \
python3dist(pyscreeze)"
RDEPENDS:${PN} += "python(abi) \
python310-Pillow"

inherit rpm
