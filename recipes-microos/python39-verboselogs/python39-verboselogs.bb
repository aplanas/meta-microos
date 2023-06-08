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

RPM_NAME = "python39-verboselogs-1.7-6.5.noarch.rpm"
RPM_HASH = "85cc6ceedb9138869aa54dc4782e3eeaa60d39e678104aa588d7ec3843ee34e0bb893b7115f00ba4ecc8f924616a86cfb98a27ef659de14572c5578ac5f7b763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(verboselogs) python39-verboselogs python3dist(verboselogs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
