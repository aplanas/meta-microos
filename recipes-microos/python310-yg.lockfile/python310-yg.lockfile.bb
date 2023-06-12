SUMMARY = "Lockfile object with timeouts and context manager"
DESCRIPTION = "A FileLock class that implements a context manager with timeouts on top \
of zc.lockfile, an excellent, cross-platorm implementation of file locking."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python310-yg.lockfile-2.3-1.10.noarch.rpm"
RPM_HASH = "21ec7651d25c5341f65a63326207253e9ebd1d7206d90e3483f6bf3f65123694f1f7a95da4811763798c3be06e1a200a0ba3f63a99e9bfe25065d61c4eb8b655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yg.lockfile \
python3.10dist(yg.lockfile) \
python310-yg.lockfile \
python3dist(yg.lockfile)"
RDEPENDS:${PN} += "python(abi) \
python310-jaraco.functools \
python310-tempora \
python310-zc.lockfile"

inherit rpm
