SUMMARY = "Tools to work with logging"
DESCRIPTION = "jaraco.logging Tools for working with logging."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "python310-jaraco.logging-3.1.2-1.8.noarch.rpm"
RPM_HASH = "c4a443000381fc9f654d203329eab03c1803c4df95a7867e2d19db1b318c680020335add8a35582732e949e573d43eaaca58262729c13522160a87ae98589ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.logging python3.10dist(jaraco.logging) python310-jaraco.logging python3dist(jaraco.logging)"
RDEPENDS:${PN} += "python(abi) python310-tempora"

inherit rpm
