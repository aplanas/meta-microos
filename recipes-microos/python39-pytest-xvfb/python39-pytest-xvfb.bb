SUMMARY = "Pytest plugin to run Xvfb for tests"
DESCRIPTION = "A pytest plugin to run Xvfb for tests. \
 \
With Xvfb and the plugin installed, your testsuite automatically runs \
with Xvfb. This allows tests to be run without windows popping up \
during GUI tests or on systems without a display (like a CI). \
 \
If Xvfb is not installed, the plugin does not run and your tests will \
still work as normal. However, a warning message will print to standard \
output letting you know that Xvfb is not installed. \
 \
If you're currently using xvfb-run in something like .travis.yml, \
simply remove it and install this plugin instead - then you'll also have the \
benefits of Xvfb locally."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-pytest-xvfb-2.0.0-2.9.noarch.rpm"
RPM_HASH = "19d752c39a31fc22ec153e9e5f1d1658b4561d8d9ff2675d9c3e939de2a337ab76e13c1178af28b36152c80af4ce858c412ed2318477cadf1fe78806c2ba8aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-xvfb) python39-pytest-xvfb python3dist(pytest-xvfb)"
RDEPENDS:${PN} += "python(abi) python39-PyVirtualDisplay python39-pytest xdpyinfo"

inherit rpm
