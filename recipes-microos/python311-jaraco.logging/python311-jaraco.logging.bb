SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python311-jaraco.logging-3.1.2-2.1.noarch.rpm"
RPM_HASH = "2ea61b87aa1bb4d29fe9d59b530dd9e9ee32990b111cd0cfcd7f85758677dd79765b34468b130a427ca84731563f8cbe6dc110c4269d25c8d7d6a06dc74ccdb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.logging) python311-jaraco.logging python3dist(jaraco.logging)"
RDEPENDS:${PN} += "python(abi) python311-tempora"

inherit rpm
