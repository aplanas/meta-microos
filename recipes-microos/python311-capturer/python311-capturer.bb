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

RPM_NAME = "python311-capturer-3.0-2.12.noarch.rpm"
RPM_HASH = "da9f53367c8b20fa4ad6e07f7f1d109f31e3037d7117c9d141cb6fc7eda8c3d7db0072efb5261c76b35425003c519df79ba6b52e920e7151b7ff18b338a5e3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(capturer) python311-capturer python3dist(capturer)"
RDEPENDS:${PN} += "python(abi) python311-humanfriendly"

inherit rpm
