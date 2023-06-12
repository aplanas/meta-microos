SUMMARY = "Pytest plugin for printing summary data as I want it"
DESCRIPTION = "Opinionated pytest plugin to make output slightly easier to read \
and errors easy to find and fix."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-pytest-pretty-1.2.0-1.1.noarch.rpm"
RPM_HASH = "2e4ff0fd8d47b655189684578ecb62806e2f246ce652a7607e7b3ce51878ef3068010865372993e65f0f2d3fd24ee02ad4f6a698425ee1a28593b7bc2b961de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-pretty python3.10dist(pytest-pretty) python310-pytest-pretty python3dist(pytest-pretty)"
RDEPENDS:${PN} += "python(abi) python310-pytest python310-rich"

inherit rpm
