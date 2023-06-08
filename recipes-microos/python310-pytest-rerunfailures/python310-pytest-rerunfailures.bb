SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "10.2"

RPM_NAME = "python310-pytest-rerunfailures-10.2-2.1.noarch.rpm"
RPM_HASH = "77782e4d303c234ba8e51e9f29900aaeff4cfeec6fc5b01f5c0ef8a6648b8b5a14b08e93c04444e7696a66bb716522eaa42973038892be2c98ae49386ee7ba47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-rerunfailures python3.10dist(pytest-rerunfailures) python310-pytest-rerunfailures python3dist(pytest-rerunfailures)"
RDEPENDS:${PN} += "python(abi) python310-pytest python310-setuptools"

inherit rpm
