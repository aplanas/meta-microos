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

RPM_NAME = "python39-pytest-console-scripts-1.3.1-1.6.noarch.rpm"
RPM_HASH = "e46ba1f0122f79365835469d6e65489b4c9f94669de8c43813c39a498b251733ee665e0a78bfee8c704dd9d9317c2a02715d8fb81b0d99725d76d7d6bac19e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-console-scripts) python39-pytest-console-scripts python3dist(pytest-console-scripts)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
