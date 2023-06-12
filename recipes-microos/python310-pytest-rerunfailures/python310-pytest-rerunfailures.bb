SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "11.1.2"

RPM_NAME = "python310-pytest-rerunfailures-11.1.2-1.1.noarch.rpm"
RPM_HASH = "a1f46c8761d700baef2d6e54079b351dfab22e151840663ca4e906e8ab904bc35034067180341a521ccdb7e130dd761a3acc0986f64785d288a57fced742805c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-rerunfailures \
python3.10dist(pytest-rerunfailures) \
python310-pytest-rerunfailures \
python3dist(pytest-rerunfailures)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest \
python310-setuptools"

inherit rpm
