SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python39-zope.testbrowser-test-6.0-1.1.noarch.rpm"
RPM_HASH = "377d3a6bd0c61a8f1a39c8225f0173f65fcca32763912acd1148b9f005a35b98bb21cad4452fa5b7c4d252f90bd5bcabbcd0f94c1bb4f3686b9480d10736c06c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-zope.testbrowser-test"
RDEPENDS:${PN} += "python39-WSGIProxy2 python39-WebTest python39-beautifulsoup4 python39-pytz python39-setuptools python39-soupsieve python39-zope.cachedescriptors python39-zope.interface python39-zope.schema"

inherit rpm
