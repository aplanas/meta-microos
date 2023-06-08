SUMMARY = "Zope testrunner script"
DESCRIPTION = "This package provides a flexible test runner with layer support."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python311-zope.testrunner-6.0-1.1.noarch.rpm"
RPM_HASH = "675415ba0fe21d0ebda260357a8ad0716501d94f79bfe06bb518b8e21ba4c820b057ccc87498ca1e3b5b3398f761f9c9ae9d8c2571d7e8e1c57ed2396222386c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zope.testrunner) python311-zope.testrunner python3dist(zope.testrunner)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-zope.exceptions python311-zope.interface update-alternatives"

inherit rpm
