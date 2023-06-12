SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-22.10.0-6.1.noarch.rpm"
RPM_HASH = "38bb38c0745fbb69abb2cd4e701d2d8cd9b5acba708b9ef7f63d0efceea37387cb4d60ac49ba64b89fbdb31f1590cdcbbcf63cb6eafb38ff7844de3a9de151ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(twisted) python311-Twisted python3dist(twisted)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Automat python311-Twisted-tls python311-attrs python311-constantly python311-hyperlink python311-incremental python311-typing_extensions python311-zope.interface update-alternatives"

inherit rpm
