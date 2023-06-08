SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-22.10.0-5.1.noarch.rpm"
RPM_HASH = "14e074be227a490b7aeec764ee19c8fc0d778506f5acae49f0b762c99f48910e7ae29d316219a09fc5d94d0ddf912009ed22bba3213d56f963ea0d1ab1963184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(twisted) python39-Twisted python3dist(twisted)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Automat python39-Twisted-tls python39-attrs python39-constantly python39-hyperlink python39-incremental python39-typing_extensions python39-zope.interface update-alternatives"

inherit rpm
