SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python39-pytest-html-3.2.0-1.3.noarch.rpm"
RPM_HASH = "dc66afb8a077d94b94f254ef76bc3e191463f933590ae1d2106949ecaaad305f04855f8c4e1b8bae13f06729dd60d83b79538bcb5814766bad21e48acaa90c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-html) python39-pytest-html python3dist(pytest-html)"
RDEPENDS:${PN} += "python(abi) python39-ansi2html python39-py python39-pytest python39-pytest-metadata"

inherit rpm
