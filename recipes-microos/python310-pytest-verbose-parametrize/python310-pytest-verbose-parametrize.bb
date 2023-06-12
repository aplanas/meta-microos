SUMMARY = "More descriptive output for parametrized pytest tests"
DESCRIPTION = "More descriptive output for parametrized py.test tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-verbose-parametrize-1.7.0-6.3.noarch.rpm"
RPM_HASH = "fb2f591d75bfb4c4887b74b1bd1403708e41c4f4546f3f34e00c8ef6d2665b4c95d29769d300ea3b335b2c69f03f4e4e9ba2b8b5581aa64cd507f46f6e01a13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-verbose-parametrize \
python3.10dist(pytest-verbose-parametrize) \
python310-pytest-verbose-parametrize \
python3dist(pytest-verbose-parametrize)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
