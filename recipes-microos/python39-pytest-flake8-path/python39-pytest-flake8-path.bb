SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-pytest-flake8-path-1.3.0-1.2.noarch.rpm"
RPM_HASH = "d40d7b18f6dd577adcf2eb5702cc57c8dccaa4e49159e8c7899e0666141837c3b601a57caa1474517751210a9438372f9bacfed5a267ca7c66d23433ca4715d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-flake8-path) \
python39-pytest-flake8-path \
python3dist(pytest-flake8-path)"
RDEPENDS:${PN} += "python(abi) \
python39-flake8 \
python39-pytest"

inherit rpm
