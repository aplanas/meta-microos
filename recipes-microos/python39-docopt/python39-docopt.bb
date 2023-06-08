SUMMARY = "Pythonic argument parser"
DESCRIPTION = "docopt creates command-line interfaces. \
 \
This way one does not need to write repeatable parser-code, \
and instead can write only the help message."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-docopt-0.6.2-7.17.noarch.rpm"
RPM_HASH = "fc57f29c18c86bd8dc47df5ad7fa8be19f9a8f47924674151f5e00a41904e8c9dcd9c8890efc9bfe0e1198ea4ad1921184b03aad6e4e8a0371f2399b94c1f5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docopt) python39-docopt python3dist(docopt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
