SUMMARY = "Basic functions for parsing and matching mime-type names"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of \
the HTTP specification [RFC 2616] for a complete explanation."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-python-mimeparse-1.6.0-5.1.noarch.rpm"
RPM_HASH = "6a9a6c62848c481cbd56dca7ab4cd5991f9c3f70d4cff7d7807a1c8d829a11afeb6677fcbd6ffe9d57860c021c15ea1e1606d96745a561f54000be22147d5514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-mimeparse) python39-python-mimeparse python3dist(python-mimeparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
