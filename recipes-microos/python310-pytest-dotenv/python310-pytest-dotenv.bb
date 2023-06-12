SUMMARY = "A pytest plugin that parses environment files"
DESCRIPTION = "A py.test plugin that parses environment files before running tests."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python310-pytest-dotenv-0.5.2-1.12.noarch.rpm"
RPM_HASH = "2bf9cec911e1c5782eeaab4140aad6674d6e3e0c81366d355753e42aec56e955f8cdd9dac5703c9421afe373095c69a8a5f9a719fe23f231d21c9bbdbf202768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-dotenv \
python3.10dist(pytest-dotenv) \
python310-pytest-dotenv \
python3dist(pytest-dotenv)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest \
python310-python-dotenv"

inherit rpm
