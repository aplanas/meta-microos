SUMMARY = "Verbose logging level for Python's logging module"
DESCRIPTION = "The verboselogs_ package extends Python's logging_ module to add the log levels \
VERBOSE_, NOTICE_, and SPAM_: \
 \
- The VERBOSE level sits between the predefined INFO and DEBUG levels. \
- The NOTICE level sits between the predefined WARNING and INFO levels. \
- The SPAM level sits between the predefined DEBUG and NOTSET levels. \
 \
It is currently tested on Python 2.6, 2.7, 3.4, 3.5 and PyPy."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python311-verboselogs-1.7-6.5.noarch.rpm"
RPM_HASH = "9781a052a247c1242f27bfca7124d37ceeba086c89f4935e7eb18ab80b8f44b2c4e724cb691af15231166960f1fb27ac1edcaee910bdb21eb3fb62e2b4ceeb65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(verboselogs) python311-verboselogs python3dist(verboselogs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
