SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-jaraco.tidelift-1.5.0-4.6.noarch.rpm"
RPM_HASH = "de3ceab5028bb83f6763e5d540e61d3ec8ea2a259627b2e00f399d5f521564b0e62df46aaaa36f6915fe04e967bd833808a13fc8be2a2088c00b0207452bd13a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.tidelift python3.10dist(jaraco.tidelift) python310-jaraco.tidelift python3dist(jaraco.tidelift)"
RDEPENDS:${PN} += "python(abi) python310-autocommand python310-importlib-resources python310-keyring python310-requests-toolbelt"

inherit rpm
