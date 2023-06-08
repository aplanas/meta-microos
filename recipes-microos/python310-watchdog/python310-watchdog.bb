SUMMARY = "Filesystem events monitoring"
DESCRIPTION = "Python API and shell utilities to monitor file system events."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-watchdog-3.0.0-1.2.noarch.rpm"
RPM_HASH = "7a84654eb36ec6783490a174cc3beb0ec4bccd4fbf88d4cab042524a6c94387c2db362f21131d06c711443224b8d0efb7c947599d962a712d62edb615859604c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-watchdog python3.10dist(watchdog) python310-watchdog python3dist(watchdog)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-PyYAML python310-pathtools update-alternatives"

inherit rpm
