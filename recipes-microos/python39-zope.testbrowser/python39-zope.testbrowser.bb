SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python39-zope.testbrowser-6.0-1.1.noarch.rpm"
RPM_HASH = "0cba016b5181d0e9d8833458ae3a3ee79bced46f80e47dcf28456198023ff848135efc5cce2f2e6602e2b566569bedc12d0e94100f62549f9f424fb274dbbe50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zope.testbrowser) python39-zope.testbrowser python3dist(zope.testbrowser)"
RDEPENDS:${PN} += "python(abi) python39-WSGIProxy2 python39-WebTest python39-beautifulsoup4 python39-pytz python39-setuptools python39-soupsieve python39-zope.cachedescriptors python39-zope.interface python39-zope.schema"

inherit rpm
