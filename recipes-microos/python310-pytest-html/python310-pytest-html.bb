SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python310-pytest-html-3.2.0-1.3.noarch.rpm"
RPM_HASH = "071ace96915ce3b5b8d8290a0ff44caea7280369f68bbb9f5026d370b6022fe246633026922c7a7653dca7dd286c45b27e30dc7b573fd92ec9e802153910e83a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-html python3.10dist(pytest-html) python310-pytest-html python3dist(pytest-html)"
RDEPENDS:${PN} += "python(abi) python310-ansi2html python310-py python310-pytest python310-pytest-metadata"

inherit rpm
