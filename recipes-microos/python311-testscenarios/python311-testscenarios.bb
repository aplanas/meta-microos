SUMMARY = "A pyunit extension for dependency injection"
DESCRIPTION = "testscenarios provides clean dependency injection for Python unittest style \
tests. This can be used for interface testing (testing many implementations via \
a single test suite) or for classic dependency injection (provide tests with \
dependencies externally to the test code itself, allowing easy testing in \
different situations)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-testscenarios-0.5.0-5.1.noarch.rpm"
RPM_HASH = "6e061ada732549c84650d5e0d1563366092aa4baafb06e774f7cfc12a1646964596fb3a17cad2831a7e3d0d94a1fb95927db5dccc31d46fc226de7546deb5907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(testscenarios) \
python311-testscenarios \
python3dist(testscenarios)"
RDEPENDS:${PN} += "python(abi) \
python311-pbr \
python311-testtools"

inherit rpm
