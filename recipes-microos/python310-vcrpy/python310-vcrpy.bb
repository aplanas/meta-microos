SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python310-vcrpy-4.2.1-1.3.noarch.rpm"
RPM_HASH = "89c39e75b8c5974f2e6a03bce02143dca0fc09f86d9eb1b4018b289992a526152ab3f57dce58d22584b6e60ad8444b409e10ed583817531f275022fc221a2b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcrpy python3.10dist(vcrpy) python310-vcrpy python3dist(vcrpy)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-six python310-wrapt python310-yarl"

inherit rpm
