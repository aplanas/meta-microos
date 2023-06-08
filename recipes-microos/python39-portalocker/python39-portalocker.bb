SUMMARY = "Locking library for Python"
DESCRIPTION = "Portalocker is a library to provide an API to file locking. \
 \
On Linux and Unix systems, the locks are advisory by default. By \
specifying the `-o mand` option to the mount command, it is possible \
to enable mandatory file locking on Linux. This is generally not \
recommended however."
LICENSE = "Python-2.0"

PV = "2.7.0"

RPM_NAME = "python39-portalocker-2.7.0-1.1.noarch.rpm"
RPM_HASH = "7ae3d48433108da71e271ceb7548fd73a6eb3c9dbfcfefdbf5494f99bca1c009316b18ab5c269b0a53cb79a3b143401e55a5a160c3ffca7f6584060eef4b2002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(portalocker) python39-portalocker python3dist(portalocker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
