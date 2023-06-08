SUMMARY = "Plugin to display pytest execution output like a specification"
DESCRIPTION = "pytest plugin to display test execution output like a specification."
LICENSE = "GPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "python310-pytest-spec-3.2.0-1.6.noarch.rpm"
RPM_HASH = "b8fa4d23941e5815a8053a4c270d609a2c276b9227e6af650531333819f7d6937e59776997a96033ced8dfcd03f8bc6b4a929e3cb61841ef3fd8cf8ff4706a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-spec python3.10dist(pytest-spec) python310-pytest-spec python3dist(pytest-spec)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
