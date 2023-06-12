SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-jaraco.tidelift-1.5.1-1.1.noarch.rpm"
RPM_HASH = "b5eafc33edefbd48d1f6c123686db10921d6cd9544c088f628d47c75aaeb71f768a97440fc71632a9cb7509c4f6356f777e7bb1435376cc28b53360992cb8e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.tidelift) \
python39-jaraco.tidelift \
python3dist(jaraco.tidelift)"
RDEPENDS:${PN} += "python(abi) \
python39-autocommand \
python39-importlib-resources \
python39-keyring \
python39-requests-toolbelt"

inherit rpm
