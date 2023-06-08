SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-22.10.0-5.1.noarch.rpm"
RPM_HASH = "e937394797e5ffe64d4d4df55f98108a59ae308a6de9864bd49152fce620ee1da0ff8ce3f7caed78079f156a8390b58e9ee55eff3b81cae26633cb55f25912da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted python3.10dist(twisted) python310-Twisted python3dist(twisted)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Automat python310-Twisted-tls python310-attrs python310-constantly python310-hyperlink python310-incremental python310-typing_extensions python310-zope.interface update-alternatives"

inherit rpm
