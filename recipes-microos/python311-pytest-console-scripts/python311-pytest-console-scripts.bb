SUMMARY = "Pytest plugin for testing console scripts"
DESCRIPTION = "Pytest-console-scripts is a `Pytest`_ plugin for testing python scripts \
installed via ``console_scripts`` entry point of ``setup.py``. It can run the \
scripts under test in a separate process or using the interpreter that's \
running the test suite.  The former mode ensures that the script will run in an \
environment that is identical to normal execution whereas the latter one allows \
much quicker test runs during development while simulating the real runs as \
much as possible."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python311-pytest-console-scripts-1.3.1-1.6.noarch.rpm"
RPM_HASH = "611758790be2314d031fb3bdfb553f2cdb452bb209ac9c4fb517f298349729d41f8740d1782d7d7d76ef9210c07008938bac6eadd548f5617137922ec2061b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-console-scripts) python311-pytest-console-scripts python3dist(pytest-console-scripts)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
