SUMMARY = "Locking library for Python"
DESCRIPTION = "Portalocker is a library to provide an API to file locking. \
 \
On Linux and Unix systems, the locks are advisory by default. By \
specifying the `-o mand` option to the mount command, it is possible \
to enable mandatory file locking on Linux. This is generally not \
recommended however."
LICENSE = "Python-2.0"

PV = "2.7.0"

RPM_NAME = "python310-portalocker-2.7.0-1.1.noarch.rpm"
RPM_HASH = "dd864be8b1ab6758fef81fa2d7b50ab2f1ad2f186ad679b882d50a09beebbe999be7e0f1a15427643323213631a6b6c15cade030baa9d4f958ef7b134eaa31d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portalocker python3.10dist(portalocker) python310-portalocker python3dist(portalocker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
