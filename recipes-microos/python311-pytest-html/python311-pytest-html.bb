SUMMARY = "Pytest plugin for generating HTML reports"
DESCRIPTION = "A plugin for pytest that generates a HTML report for test results."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "python311-pytest-html-3.2.0-1.3.noarch.rpm"
RPM_HASH = "d78a2b067073088c8e146fd1d0f7de1a60a62f6238d99e4b9c2a14f09a2bb4eff18f690d3fb18e7c99702fe7cdb8578c2149bbb03b0f0eddfb703c659279c096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-html) python311-pytest-html python3dist(pytest-html)"
RDEPENDS:${PN} += "python(abi) python311-ansi2html python311-py python311-pytest python311-pytest-metadata"

inherit rpm
