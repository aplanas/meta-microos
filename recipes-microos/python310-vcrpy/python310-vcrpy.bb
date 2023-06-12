SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python310-vcrpy-4.2.1-2.1.noarch.rpm"
RPM_HASH = "ae0670d2f154b506e986398bf95ffc5620c26d8ddad636127311040ae87cecb5467a760fb9b2525be5f0becc28f269777985bf5d9f15c7a7764b8579a55924a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcrpy python3.10dist(vcrpy) python310-vcrpy python3dist(vcrpy)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-six python310-urllib3 python310-wrapt python310-yarl"

inherit rpm
