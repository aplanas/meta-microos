SUMMARY = "Immutable URL support for Python"
DESCRIPTION = "Hyperlink provides a pure-Python implementation of immutable URLs \
based on RFC 3986 and 3987."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python311-hyperlink-21.0.0-2.1.noarch.rpm"
RPM_HASH = "71acb6a745214d22aa97ba985146dc3ebbba9adac6f07153e5817647ef9acc5930ba0485228cedc30de38c8993a35e34f9bea45380fbb7b5d1d7e78307594396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hyperlink) python311-hyperlink python3dist(hyperlink)"
RDEPENDS:${PN} += "python(abi) python311-idna"

inherit rpm
