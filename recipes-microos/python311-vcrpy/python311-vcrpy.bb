SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python311-vcrpy-4.2.1-1.3.noarch.rpm"
RPM_HASH = "6e967fa5178fceac89e15613dfb2606a688cc2d1c451f6f1ca9b9e33127de011ba4a114e94f59ce410d42918ccaae61e49b1e76067ce4b76023b5d0dca916ccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vcrpy) python311-vcrpy python3dist(vcrpy)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML python311-six python311-wrapt python311-yarl"

inherit rpm
