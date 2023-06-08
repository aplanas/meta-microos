SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-pytest-regressions-2.2.0-2.1.noarch.rpm"
RPM_HASH = "d6ed2bbd07cbec001b0966cdde3b7b1c21b9860d44d1aa29519deebf87c988614e9ddb28795dd0827ddf3a6dfc122c0dc43aa8f7e00331b914927d344b575f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-regressions) python39-pytest-regressions python3dist(pytest-regressions)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-pytest python39-pytest-datadir"

inherit rpm
