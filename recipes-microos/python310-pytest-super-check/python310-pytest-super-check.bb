SUMMARY = "Pytest plugin to check your TestCase classes call super in setUp, tearDown, etc"
DESCRIPTION = "Pytest plugin to check your TestCase classes call super in setUp, tearDown, etc."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pytest-super-check-2.1.0-1.17.noarch.rpm"
RPM_HASH = "a6adc087378b3417c1e74a2b14653313eaefc032ee8d0ab0b74a1fdea5dbc7e1fb7bc861fd6683f9c580360007fe8451261c1176db3605004d2f64b77b30f5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-super-check python3.10dist(pytest-super-check) python310-pytest-super-check python3dist(pytest-super-check)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
