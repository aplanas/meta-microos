SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "10.2"

RPM_NAME = "python311-pytest-rerunfailures-10.2-2.1.noarch.rpm"
RPM_HASH = "9e0f2b432cad748acb6044f9a0ad9b5abe94147de19100f6b61b470f8acfc0c478466a8e4885f44527833b3a068c8fe7545c0859e4dbb083753e3b5d05357cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-rerunfailures) python311-pytest-rerunfailures python3dist(pytest-rerunfailures)"
RDEPENDS:${PN} += "python(abi) python311-pytest python311-setuptools"

inherit rpm
