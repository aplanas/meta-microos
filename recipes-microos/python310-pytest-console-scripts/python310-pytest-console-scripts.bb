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

RPM_NAME = "python310-pytest-console-scripts-1.3.1-1.6.noarch.rpm"
RPM_HASH = "ea89300da231019f2cbe0c403476a0b18c740a4ba07c0bb37256b38a97dc2605ba6f6cbb6455fa08d2283281225703bc60a4e64afb4d36640643871571a6c9bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-console-scripts python3.10dist(pytest-console-scripts) python310-pytest-console-scripts python3dist(pytest-console-scripts)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
