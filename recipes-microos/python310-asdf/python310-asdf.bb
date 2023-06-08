SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "python310-asdf-2.13.0-1.4.noarch.rpm"
RPM_HASH = "c7f83a88340c3409dce955d73281d8fc66d21d0e85e50a47bddbad80d3fb32fee817fdbd2dd7f0c3d24ed77a200f63f71fafcff551778bdcebc7daf9f20d7183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf python3.10dist(asdf) python310-asdf python3dist(asdf)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-asdf-standard python310-asdf-transform-schemas python310-jmespath python310-jsonschema python310-numpy python310-packaging python310-semantic_version update-alternatives"

inherit rpm
