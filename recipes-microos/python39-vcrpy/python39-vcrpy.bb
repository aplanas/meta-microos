SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python39-vcrpy-4.2.1-1.3.noarch.rpm"
RPM_HASH = "3e5be9650e78a0d272e53b4137a9d45afd8939c97f0e309d506968feb153748163be1c14d0b7fbaa9ef5b6c7155c88c7bff81930536ce6ff0e1deca557bfec50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vcrpy) python39-vcrpy python3dist(vcrpy)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-six python39-wrapt python39-yarl"

inherit rpm
