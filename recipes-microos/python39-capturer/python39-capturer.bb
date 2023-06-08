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

RPM_NAME = "python39-capturer-3.0-2.12.noarch.rpm"
RPM_HASH = "551b1e830ebc52713cd99066ea6c622bfa06da5ba6ac67c3b4a468675faa70d66a31da7f19d3783e185fd806453253d46ffeb6ed6606b37268a683ca94e8834c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(capturer) python39-capturer python3dist(capturer)"
RDEPENDS:${PN} += "python(abi) python39-humanfriendly"

inherit rpm
