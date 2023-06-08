SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-22.10.0-5.1.noarch.rpm"
RPM_HASH = "7d8651a73307dab6036263b36cf911cf735ee861d616e58c52df7ad31ab4fe6e20152433ef087bc57bf87922f59b05b2080f664f3fe8056777fa264199a185cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(twisted) python311-Twisted python3dist(twisted)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Automat python311-Twisted-tls python311-attrs python311-constantly python311-hyperlink python311-incremental python311-typing_extensions python311-zope.interface update-alternatives"

inherit rpm
