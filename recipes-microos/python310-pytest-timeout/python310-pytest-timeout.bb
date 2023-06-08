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

RPM_NAME = "python310-pytest-timeout-2.1.0-2.1.noarch.rpm"
RPM_HASH = "7e3efaf4b69fec6d1e85285fa41f560c4712ed56e40f59e8eff725088d160ac3cc76ea1364df4ac3f9e254f545a72f812fd634b377a96efb9033bc9860a44503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-timeout python3.10dist(pytest-timeout) python310-pytest-timeout python3dist(pytest-timeout)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
