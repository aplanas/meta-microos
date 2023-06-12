SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "11.1.2"

RPM_NAME = "python311-pytest-rerunfailures-11.1.2-1.1.noarch.rpm"
RPM_HASH = "5edf57d29bbd928d75f1d5e2a3b565e8f9ea125bb68f0da6ae69b1d121e55b563befabf7c40baec4e5d3287659d09d4ce3a617fad26940598c3690ba118516f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-rerunfailures) \
python311-pytest-rerunfailures \
python3dist(pytest-rerunfailures)"
RDEPENDS:${PN} += "python(abi) \
python311-pytest \
python311-setuptools"

inherit rpm
