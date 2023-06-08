SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-loguru-0.7.0-1.1.noarch.rpm"
RPM_HASH = "ec4efbd3176742695c7b5fa752a5d8ea453cd186309614d805bb065e671f5ea4803a96c44893a4fb97b73edb88fb727054c0135878a2014a0a7bc2351fe36a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(loguru) python39-loguru python3dist(loguru)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
