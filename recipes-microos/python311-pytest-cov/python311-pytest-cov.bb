SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-pytest-cov-4.0.0-4.1.noarch.rpm"
RPM_HASH = "17f672e37acdf58ee01a19075e933d83369155e80e9425885fd5418a2cbb505aac5766719e1c8bb19cf79412430a4b88288923faeb7405d455165a349a1c181e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-cov) python311-pytest-cov python3dist(pytest-cov)"
RDEPENDS:${PN} += "python(abi) python311-coverage python311-pytest"

inherit rpm
