SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-jaraco.tidelift-1.5.0-4.6.noarch.rpm"
RPM_HASH = "4d044a225116d81c377c94c48b71fa718563027a2e2b964db68f1226495b2f639a842ec1c9c90f8fe862597726624dc2c9a565d38ba6caaa720cfbed65ea1d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.tidelift) python311-jaraco.tidelift python3dist(jaraco.tidelift)"
RDEPENDS:${PN} += "python(abi) python311-autocommand python311-importlib-resources python311-keyring python311-requests-toolbelt"

inherit rpm
