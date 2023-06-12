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

RPM_NAME = "python39-zc.lockfile-2.0-2.8.noarch.rpm"
RPM_HASH = "8fd476017ac21189ad285cfb35a253d60685acb903354a08b9da6692f1cedfb11a8be44a341448cc40b10e5c1120ea490bac352e95947a14b7d49fc16e3a1378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zc.lockfile) \
python39-zc-lockfile \
python39-zc.lockfile \
python3dist(zc.lockfile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
