SUMMARY = "Documentation for python-mpld3"
DESCRIPTION = "Documentation and examples for python-mpld3"
LICENSE = "BSD-3-Clause"

PV = "0.5.9"

RPM_NAME = "python-mpld3-doc-0.5.9-1.3.noarch.rpm"
RPM_HASH = "c2a6635e23903100e0a45d8834a5b40663463b1ee584d1b89118c0fc6c2cf70960140a64a898251540be8b6b960fe19fcdedc3df9ac70b237eaba0b6bf31474b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mpld3-doc python310-python-mpld3 python311-python-mpld3 python39-python-mpld3"
RDEPENDS:${PN} += ""

inherit rpm
