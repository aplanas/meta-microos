SUMMARY = "A language for matching/validating/filtering Python dictionaries"
DESCRIPTION = "The kmatch library provides a language for matching Python \
dictionaries. Patterns are specified as lists of filters combined \
with logical operators."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-kmatch-0.4.0-2.3.noarch.rpm"
RPM_HASH = "d7fce8fbac01c2d92d3235f951d0149af50f5de0d3a7c76991e7e0403132b995b9af4934077042e97895e2c30bd2220480af035da054890110b8ba45855e12da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kmatch python3.10dist(kmatch) python310-kmatch python3dist(kmatch)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
