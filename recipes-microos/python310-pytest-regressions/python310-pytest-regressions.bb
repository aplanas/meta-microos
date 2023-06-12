SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "python310-pytest-regressions-2.4.2-3.1.noarch.rpm"
RPM_HASH = "cb3cc8f6c863d214501bac1369b93f89ef0a4f0632f32bc2d105a7cb6238cbba27c06902781085b5a38188115327827f1b75256b48e3cde2a5f32d1b441b83b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-regressions python3.10dist(pytest-regressions) python310-pytest-regressions python3dist(pytest-regressions)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-pytest python310-pytest-datadir"

inherit rpm
