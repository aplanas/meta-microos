SUMMARY = "Pytest plugin to abort hanging tests"
DESCRIPTION = "This is a plugin which will terminate tests after a certain timeout. \
When doing so it will show a stack dump of all threads running at the \
time.  This is useful when running tests under a continuous \
integration server or simply if you don't know why the test suite \
hangs. \
 \
Note that while by default on POSIX systems pytest will continue to \
execute the tests after a test has timed, out this is not always \
possible.  Often the only sure way to interrupt a hanging test is by \
terminating the entire process.  As this is a hard termination \
(``os._exit()``) it will result in no teardown, JUnit XML output etc. \
But the plugin will ensure you will have the debugging output on \
stderr nevertheless, which is the most important part at this stage."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-pytest-timeout-2.1.0-2.1.noarch.rpm"
RPM_HASH = "cc890918969c2cb2aeadb52d018e9186ec207d8231bb818aea3e8530767263364cc9435daa225f778f5dd1a518b3c552546b095b392d37580900e2efe7eb8d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-timeout) \
python39-pytest-timeout \
python3dist(pytest-timeout)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
