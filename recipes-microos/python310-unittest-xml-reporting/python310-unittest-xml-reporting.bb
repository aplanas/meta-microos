SUMMARY = "PyUnit-based test runner with JUnit like XML reporting"
DESCRIPTION = "unittest-xml-reporting is a unittest test runner that can save test results \
to XML files that can be consumed by a wide range of tools, such as build \
systems, IDEs and continuous integration servers."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "python310-unittest-xml-reporting-3.0.2-3.2.noarch.rpm"
RPM_HASH = "14c7e2085aa92b124884fff329c547b85b684c637acdbe775ff30541188c759c91529ea740ac800e6956d71259529b8a289bf6c6d44f9c09381848a9ee555fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unittest-xml-reporting python3-xmlrunner python3.10dist(unittest-xml-reporting) python310-unittest-xml-reporting python310-xmlrunner python3dist(unittest-xml-reporting)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
