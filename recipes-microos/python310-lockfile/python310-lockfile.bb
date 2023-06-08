SUMMARY = "Platform-independent file locking module"
DESCRIPTION = "The lockfile package exports a LockFile class which provides a simple API for \
locking files.  Unlike the Windows msvcrt.locking function, the fcntl.lockf \
and flock functions, and the deprecated posixfile module, the API is \
identical across both Unix (including Linux and Mac) and Windows platforms. \
The lock mechanism relies on the atomic nature of the link (on Unix) and \
mkdir (on Windows) system calls.  An implementation based on SQLite is also \
provided, more as a demonstration of the possibilities it provides than as \
production-quality code."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python310-lockfile-0.12.2-3.1.noarch.rpm"
RPM_HASH = "f7bc8c45a943cd421cebff297e307597afaf21ce6817c5aac7e089b828d9d8c034a835f1c75c4ea9d11c123b6a87d821e37113956847c8740a32594e85f092c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lockfile python3.10dist(lockfile) python310-lockfile python3dist(lockfile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
