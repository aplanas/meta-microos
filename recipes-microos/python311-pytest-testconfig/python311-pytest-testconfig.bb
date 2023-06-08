SUMMARY = "Test configuration plugin for pytest"
DESCRIPTION = "pytest-testconfig is a plugin to the pytest test framework used for passing test-specific (or test-run specific) configuration data \
to the tests being executed."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python311-pytest-testconfig-0.2.0-1.14.noarch.rpm"
RPM_HASH = "cf6dc1d64c828be6000fe3cc3cb479787d8a242b4257cbf584fdc4bf5e21279ae89b6e744189bf48014e9d33e33460d14b6d0003826b7ff03700069a1ed52c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-testconfig) python311-pytest-testconfig python3dist(pytest-testconfig)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
