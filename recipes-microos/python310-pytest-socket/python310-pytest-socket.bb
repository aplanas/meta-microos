SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python310-pytest-socket-0.3.5-1.12.noarch.rpm"
RPM_HASH = "a64a86c1b642bd722e1926fd2e142437cd266f8cb2feeb70bed2346f50b67c18b2f1ef44c20c72f1b1ca0feac552a117da93e4c88545cb070589516381c54b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-socket python3.10dist(pytest-socket) python310-pytest-socket python3dist(pytest-socket)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
