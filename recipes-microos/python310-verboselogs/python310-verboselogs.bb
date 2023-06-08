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

RPM_NAME = "python310-verboselogs-1.7-6.5.noarch.rpm"
RPM_HASH = "41662864058d5e4d8bc4e4337241fb06ab871623da2155f5451447e6da8158cdd92de322651355bde8b9a618dd47ed78359a67eb43d63eb5959fd4f305aa3024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-verboselogs python3.10dist(verboselogs) python310-verboselogs python3dist(verboselogs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
