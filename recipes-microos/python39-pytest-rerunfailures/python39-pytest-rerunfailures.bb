SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "10.2"

RPM_NAME = "python39-pytest-rerunfailures-10.2-2.1.noarch.rpm"
RPM_HASH = "3c49d27a10e0a622793389ef8bc00467e80819b459cbb378f609019f83e5cbfbc15fd21ffdc661eb421e4627e6d12b9b58280a168250bae9d611748360b0d579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-rerunfailures) python39-pytest-rerunfailures python3dist(pytest-rerunfailures)"
RDEPENDS:${PN} += "python(abi) python39-pytest python39-setuptools"

inherit rpm
