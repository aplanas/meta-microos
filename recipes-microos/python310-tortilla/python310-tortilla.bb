SUMMARY = "A library for creating wrappers around web APIs"
DESCRIPTION = "Wrapping web APIs made easy. \
A tiny library for creating wrappers around web APIs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-tortilla-0.5.0-1.14.noarch.rpm"
RPM_HASH = "69c85bd53c40a71e764b14d6024b34b0580b65e1377d04176f5bd0bb5fd69f3810f92a61bae0049e7d52dcc78c440198c458af12e57352db618b2c26950c1cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tortilla python3.10dist(tortilla) python310-tortilla python3dist(tortilla)"
RDEPENDS:${PN} += "python(abi) python310-colorama python310-formats python310-httpretty python310-requests python310-six"

inherit rpm
