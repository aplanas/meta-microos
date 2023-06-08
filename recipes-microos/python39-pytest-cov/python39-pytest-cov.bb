SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-pytest-cov-4.0.0-4.1.noarch.rpm"
RPM_HASH = "d3ab7a5ba883f3fb4a9763556afdb22c7b86ee59d831c473459d594aed7d3f59cd5d84b523efa8d1ce7802a9a34c38ab7c893ef5fd0f11a6c61506130002f707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-cov) python39-pytest-cov python3dist(pytest-cov)"
RDEPENDS:${PN} += "python(abi) python39-coverage python39-pytest"

inherit rpm
