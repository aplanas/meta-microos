SUMMARY = "Basic inter-process locks"
DESCRIPTION = "The zc.lockfile package provides a basic portable implementation of \
interprocess locks using lock files. The purpose if not specifically to lock \
files, but to simply provide locks with an implementation based on file-locking \
primitives. Of course, these locks could be used to mediate access to other \
files. For example, the ZODB file storage implementation uses file locks to \
mediate access to file-storage database files. The database files and lock file \
files are separate files."
LICENSE = "ZPL-2.1"

PV = "2.0"

RPM_NAME = "python311-zc.lockfile-2.0-2.8.noarch.rpm"
RPM_HASH = "f80105afd4926a4ac0bc85f716fd1703d4942633c56de80646f2fc7171f92ff30028197137363af9fdb392e760d50d7cdcd5576421aecd0c7ed6c6e1ac12fc3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zc.lockfile) python311-zc-lockfile python311-zc.lockfile python3dist(zc.lockfile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
