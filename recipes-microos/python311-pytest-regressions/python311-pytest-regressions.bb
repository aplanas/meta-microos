SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python311-pytest-regressions-2.2.0-2.1.noarch.rpm"
RPM_HASH = "578f5e23e1421adb3fa05eb39f14741f36a19c55cb6aa9632597b10fb6a210c9abf793f7e46b1bd03504bf18c899da3fdeaf20d5737bccc7aafc60f449385960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-regressions) python311-pytest-regressions python3dist(pytest-regressions)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML python311-pytest python311-pytest-datadir"

inherit rpm
