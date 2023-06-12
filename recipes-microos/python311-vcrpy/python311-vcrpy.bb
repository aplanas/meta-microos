SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python311-vcrpy-4.2.1-2.1.noarch.rpm"
RPM_HASH = "096bf76ffaa42c64f3825bded339cad4d27b75c3a1b29199b6dbdea8fbaa28760e730cde76ecfbe1f4b7afdea23008542fb90fa90c0a4e2223f903e589f4bad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vcrpy) python311-vcrpy python3dist(vcrpy)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML python311-six python311-urllib3 python311-wrapt python311-yarl"

inherit rpm
