SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-pytest-toolbox-0.4-3.3.noarch.rpm"
RPM_HASH = "830cb37fe3d2f4b74acc9031ec053a62ce3e7e367e1b5ae49948b12b6f346e6f4a66b8f07864b886f0320f700c25ae9b141b3671fb4c91de1bae81881d5d67ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-toolbox) python39-pytest-toolbox python3dist(pytest-toolbox)"
RDEPENDS:${PN} += "python(abi) python39-py python39-pytest"

inherit rpm
