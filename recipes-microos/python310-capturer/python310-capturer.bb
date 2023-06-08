SUMMARY = "Python module for capturing stdout/stderr of the current process group"
DESCRIPTION = "The capturer package captures the stdout and stderr streams \
of the current process *and subprocesses*. Output can be relayed to the \
terminal in real time, but is also available to the Python program for \
additional processing. It's currently tested on cPython 2.6, 2.7, 3.4, 3.5, 3.6 \
and PyPy (2.7). It's tested on Linux and Mac OS X and may work on other unixes \
but definitely won't work on Windows (due to the use of the platform dependent \
'pty' module)."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "python310-capturer-3.0-2.12.noarch.rpm"
RPM_HASH = "9cbe77ce30e73bc7cffcf51807b17a5e81002fd075d5e27ca000783af454b391eaa251609e5bc91a9e115d09b132adbb2fb47627226a8ad295a7690e98538a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-capturer python3.10dist(capturer) python310-capturer python3dist(capturer)"
RDEPENDS:${PN} += "python(abi) python310-humanfriendly"

inherit rpm
