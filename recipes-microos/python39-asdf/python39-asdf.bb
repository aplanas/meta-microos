SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "python39-asdf-2.13.0-1.4.noarch.rpm"
RPM_HASH = "a8237998d32917d12a70bc514c78b8a69313d073a2e073aa7d84547a706e8ea0b2847146dd43e791192751fcfe4e977aa2ba4cbbd79fd38a91751cc266a4ea1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asdf) python39-asdf python3dist(asdf)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PyYAML python39-asdf-standard python39-asdf-transform-schemas python39-jmespath python39-jsonschema python39-numpy python39-packaging python39-semantic_version update-alternatives"

inherit rpm
