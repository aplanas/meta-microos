SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "python311-asdf-2.13.0-1.4.noarch.rpm"
RPM_HASH = "3db8fd2e4ad90ced1ab42838e0c38162e4a6131e6896e8d1f2f1e2438042d138ec57c6949c189a6693204c3a6ddbf022a081810d9255eedec49f9a2d1b6fdfc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asdf) python311-asdf python3dist(asdf)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-asdf-standard python311-asdf-transform-schemas python311-jmespath python311-jsonschema python311-numpy python311-packaging python311-semantic_version update-alternatives"

inherit rpm
