SUMMARY = "Pluggable object copying mechanism"
DESCRIPTION = "This package provides a pluggable mechanism for copying persistent objects. \
 \
Documentation is hosted at https://zopecopy.readthedocs.io/en/latest/"
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python311-zope.copy-4.3-1.3.noarch.rpm"
RPM_HASH = "1f8bad4c0ce6ed2214943461996173c1b29744a225fb3d0f082eaaa2bd6dfe4002e556e816dea653ca8c303853e262da84fab00ce834610c2e8cea4245ba1d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.copy) python311-zope.copy python3dist(zope.copy)"
RDEPENDS:${PN} += "python(abi) python311-zope.interface"

inherit rpm
