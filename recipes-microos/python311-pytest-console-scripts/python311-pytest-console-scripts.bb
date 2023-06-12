SUMMARY = "Pytest plugin for testing console scripts"
DESCRIPTION = "Pytest-console-scripts is a `Pytest`_ plugin for testing python scripts \
installed via ``console_scripts`` entry point of ``setup.py``. It can run the \
scripts under test in a separate process or using the interpreter that's \
running the test suite.  The former mode ensures that the script will run in an \
environment that is identical to normal execution whereas the latter one allows \
much quicker test runs during development while simulating the real runs as \
much as possible."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python311-pytest-console-scripts-1.4.1-1.1.noarch.rpm"
RPM_HASH = "20a0c6247950db0b401990ee2e633b955549ce2208891aeda5654401f321203401a132c407a739e3466207626fa79db5c730719095b1194be1f7964c672e9954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-console-scripts) \
python311-pytest-console-scripts \
python3dist(pytest-console-scripts)"
RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
