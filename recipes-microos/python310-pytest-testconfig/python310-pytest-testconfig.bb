SUMMARY = "Test configuration plugin for pytest"
DESCRIPTION = "pytest-testconfig is a plugin to the pytest test framework used for passing test-specific (or test-run specific) configuration data \
to the tests being executed."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-pytest-testconfig-0.2.0-1.14.noarch.rpm"
RPM_HASH = "68eaadee8dd17f477a5d5b438f4ed219fbf71df8f2c3afe68b5e47bc3c46c689a1e46c953533b2281046684786e3cdaecaa261bec0228ee4228788cad9466edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-testconfig \
python3.10dist(pytest-testconfig) \
python310-pytest-testconfig \
python3dist(pytest-testconfig)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
