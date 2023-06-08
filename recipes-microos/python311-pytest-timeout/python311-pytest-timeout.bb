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

RPM_NAME = "python311-pytest-timeout-2.1.0-2.1.noarch.rpm"
RPM_HASH = "aa010ebda26565e649752af4aba3d95f14aae2637b7751485afc138a4d352990650f640bb7c60fe9d21fa88e4f4ad6da3bae414dabad4977a3550e0d5fa2c8f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-timeout) python311-pytest-timeout python3dist(pytest-timeout)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
