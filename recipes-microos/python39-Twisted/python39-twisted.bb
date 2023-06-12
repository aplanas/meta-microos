SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-22.10.0-6.1.noarch.rpm"
RPM_HASH = "24bedcc666c8e7adddd9598ba3669a7ca676604e0e3f6e4c351f6a7f4ef8a620be43694befb3916d2600413bed0f669f52f614dfa4eb7d45715cea45058d831a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(twisted) python39-Twisted python3dist(twisted)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Automat python39-Twisted-tls python39-attrs python39-constantly python39-hyperlink python39-incremental python39-typing_extensions python39-zope.interface update-alternatives"

inherit rpm
