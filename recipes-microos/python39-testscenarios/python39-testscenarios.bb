SUMMARY = "A pyunit extension for dependency injection"
DESCRIPTION = "testscenarios provides clean dependency injection for Python unittest style \
tests. This can be used for interface testing (testing many implementations via \
a single test suite) or for classic dependency injection (provide tests with \
dependencies externally to the test code itself, allowing easy testing in \
different situations)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-testscenarios-0.5.0-5.1.noarch.rpm"
RPM_HASH = "37682bfa9d8a98ad349dc4705096b69ee88a0c53bf78171c8a3ddaeb1988600ffc4d985c7f6f4ab4af64d38babf74f905e193a601250b2f446ac98bfd874066a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(testscenarios) python39-testscenarios python3dist(testscenarios)"
RDEPENDS:${PN} += "python(abi) python39-pbr python39-testtools"

inherit rpm
