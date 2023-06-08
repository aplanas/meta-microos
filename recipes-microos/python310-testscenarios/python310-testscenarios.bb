SUMMARY = "A pyunit extension for dependency injection"
DESCRIPTION = "testscenarios provides clean dependency injection for Python unittest style \
tests. This can be used for interface testing (testing many implementations via \
a single test suite) or for classic dependency injection (provide tests with \
dependencies externally to the test code itself, allowing easy testing in \
different situations)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-testscenarios-0.5.0-5.1.noarch.rpm"
RPM_HASH = "7255e05b6d47c02463984d0d08ffdafb55a0c50bc294cac2de2e6e8e3a49524f8e9abc7826ced231338d274e467c3c3be0dc63eec5c720d3d25c45adba92f527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testscenarios python3.10dist(testscenarios) python310-testscenarios python3dist(testscenarios)"
RDEPENDS:${PN} += "python(abi) python310-pbr python310-testtools"

inherit rpm
