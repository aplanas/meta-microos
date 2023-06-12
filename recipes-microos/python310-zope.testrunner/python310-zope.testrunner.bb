SUMMARY = "Zope testrunner script"
DESCRIPTION = "This package provides a flexible test runner with layer support."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python310-zope.testrunner-6.0-1.1.noarch.rpm"
RPM_HASH = "4f0fd640ba8e1dd6e07c17172e7dd217ccebd05d4c5981995f64a1fb68a1f99d1be1cd1e04f56b3e0342b5785401bb232b4b0cf727708b1e91e3f31808484159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testrunner \
python3.10dist(zope.testrunner) \
python310-zope.testrunner \
python3dist(zope.testrunner)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-zope.exceptions \
python310-zope.interface \
update-alternatives"

inherit rpm
