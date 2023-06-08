SUMMARY = "PyUnit-based test runner with JUnit like XML reporting"
DESCRIPTION = "unittest-xml-reporting is a unittest test runner that can save test results \
to XML files that can be consumed by a wide range of tools, such as build \
systems, IDEs and continuous integration servers."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "python39-unittest-xml-reporting-3.0.2-3.2.noarch.rpm"
RPM_HASH = "6d39a296d4dc78e96f76b30eba9ee6325256498d60400f891a008f5a6e34b4526ad0ccc93717dddf51e1c087674f1d84a9a0909eac3ddadc74b5f2f1b1d9e1e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(unittest-xml-reporting) python39-unittest-xml-reporting python39-xmlrunner python3dist(unittest-xml-reporting)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
