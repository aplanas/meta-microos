SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-pytest-cov-4.1.0-1.1.noarch.rpm"
RPM_HASH = "c2a78c3ac1e32757987bb4304926007a0c6eb82fb62d069ef09282acf097d82255a2b4ccb4576163ca115024c4c5b2776f8e88b4f0b8fce14641b5414e08be1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-cov) python311-pytest-cov python3dist(pytest-cov)"
RDEPENDS:${PN} += "python(abi) python311-coverage python311-pytest"

inherit rpm
