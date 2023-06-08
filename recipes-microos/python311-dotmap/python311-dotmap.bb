SUMMARY = "Python ordered, dynamically-expandable dot-access dictionary"
DESCRIPTION = "Python ordered, dynamically-expandable dot-access dictionary."
LICENSE = "MIT"

PV = "1.3.30"

RPM_NAME = "python311-dotmap-1.3.30-1.3.noarch.rpm"
RPM_HASH = "01a00cb2fabca42dcb515085a8b6a11d71115b5b6f4c912f9fb78676f001af4c48bafa05f922d6d6fec4398fb2662a88e5d661022c5c4f2e2edc98c389f882ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dotmap) python311-dotmap python3dist(dotmap)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
