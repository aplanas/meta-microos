SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-jaraco.tidelift-1.5.0-4.6.noarch.rpm"
RPM_HASH = "85b1879fcc30e3440f9394291898d99673b97a17f588ad758e57a7811c36188ebb21e6985d02e8ac0306da2b1ee185d3e368950160c3103b6359ac25248674bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.tidelift) python39-jaraco.tidelift python3dist(jaraco.tidelift)"
RDEPENDS:${PN} += "python(abi) python39-autocommand python39-importlib-resources python39-keyring python39-requests-toolbelt"

inherit rpm
