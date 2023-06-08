SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python39-jaraco.logging-3.1.2-1.8.noarch.rpm"
RPM_HASH = "2ccb3db38484697fcca76ba658230b137303b7ef2da93b4c5eca2e07254f26fb4584ad1f9f0005203ef21f1ff3c850be6441632f3dd386324a69f306aba092b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.logging) python39-jaraco.logging python3dist(jaraco.logging)"
RDEPENDS:${PN} += "python(abi) python39-tempora"

inherit rpm
