SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "This plugin produces coverage reports.  It supports centralised testing \
and distributed testing in both load and each modes.  It also supports \
coverage of subprocesses. \
 \
All features offered by the coverage package should be available, either \
through pytest-cov or through coverage's config file."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-pytest-cov-4.1.0-1.1.noarch.rpm"
RPM_HASH = "974ec0fd508fbc267227d126d8e0444fcdda018a46834990854e77df9f782829add8015fe990c3269d59eccd0153f1a21241d3334a2ae22abea19898f0b6c732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-cov \
python3.10dist(pytest-cov) \
python310-pytest-cov \
python3dist(pytest-cov)"
RDEPENDS:${PN} += "python(abi) \
python310-coverage \
python310-pytest"

inherit rpm
