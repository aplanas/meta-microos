SUMMARY = "Pluggable object copying mechanism"
DESCRIPTION = "This package provides a pluggable mechanism for copying persistent objects. \
 \
Documentation is hosted at https://zopecopy.readthedocs.io/en/latest/"
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python310-zope.copy-4.3-1.3.noarch.rpm"
RPM_HASH = "49a315ff6ecd6c734d4f110065854a07c51d80382d303ea6121eb99e27e48a206dd2d3fb5b078883dd7f8eecb54267f0ec445473239bad976356a5f1fa043376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.copy python3.10dist(zope.copy) python310-zope.copy python3dist(zope.copy)"
RDEPENDS:${PN} += "python(abi) python310-zope.interface"

inherit rpm
