SUMMARY = "Zope Exceptions"
DESCRIPTION = "This package contains exception interfaces and implementations which are so \
general purpose that they don't belong in Zope application-specific packages."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python310-zope.exceptions-4.6-1.3.noarch.rpm"
RPM_HASH = "107ccceddf91c589eb88a88dd9b292af0fde29fe11c04071167aec48ca1d3a3bc67833e966023418640ee6f6b48d6178519e1666b2bd5fd9b859be940799e2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.exceptions python3.10dist(zope.exceptions) python310-zope.exceptions python3dist(zope.exceptions)"
RDEPENDS:${PN} += "python(abi) python310-zope.interface"

inherit rpm
