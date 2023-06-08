SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-pytest-cov-4.0.0-4.1.noarch.rpm"
RPM_HASH = "9835e812b1aa060e2924e1efbfc43ff6a073d1818322720e5b0fa0825964a875acc2ef0282a82c79387a8d020dee95defaeea6b2a058999cca64d492633e96f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cov python3.10dist(pytest-cov) python310-pytest-cov python3dist(pytest-cov)"
RDEPENDS:${PN} += "python(abi) python310-coverage python310-pytest"

inherit rpm
