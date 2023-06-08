SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python310-zope.testbrowser-test-6.0-1.1.noarch.rpm"
RPM_HASH = "5c85bb96c5618e8b489a0f7a1dfedfb8758ae2d62b48b79155758b57ac1ab584bedb01f7976ea83f285f591c17067417e06bc3da8e55faec083e1949d2bf56b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testbrowser-test python310-zope.testbrowser-test"
RDEPENDS:${PN} += "python310-WSGIProxy2 python310-WebTest python310-beautifulsoup4 python310-pytz python310-setuptools python310-soupsieve python310-zope.cachedescriptors python310-zope.interface python310-zope.schema"

inherit rpm
