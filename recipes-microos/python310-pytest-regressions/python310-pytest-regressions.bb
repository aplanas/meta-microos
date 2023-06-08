SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-pytest-regressions-2.2.0-2.1.noarch.rpm"
RPM_HASH = "1ddbc93f116b81efe3e22ac5c5519d2ff498e50e5d59d41a889275bd5d09f15fe9348e2a170fa0f723d4180781500bdb90e2b1d4d200810e9f1b61824365675b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-regressions python3.10dist(pytest-regressions) python310-pytest-regressions python3dist(pytest-regressions)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-pytest python310-pytest-datadir"

inherit rpm
