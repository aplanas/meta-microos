SUMMARY = "Documentation files for python-marshmallow"
DESCRIPTION = "HTML Documentation and examples for python-marshmallow."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python-marshmallow-doc-3.19.0-3.1.noarch.rpm"
RPM_HASH = "1e8bf5be2f5d80c3282eb9ec12d5b09d21e9e0b8cccc95222b65b14bc8a0244f7244d57a5fd2806d0fae3c67c6d5b5b96f2477eae08a4b9c30cbb8d71d04b329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-marshmallow-doc python-marshmallow-docs"
RDEPENDS:${PN} += ""

inherit rpm
