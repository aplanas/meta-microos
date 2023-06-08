SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-pick-2.2.0-1.4.noarch.rpm"
RPM_HASH = "bc13564636d42d25a656a4d2a320af7e8aeb4c0457cddf87f5bc416787f196ea05172aebc832ac58e4c49cf21935757f3bfdc94fd0eea483d0afed4320e08311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pick python3.10dist(pick) python310-pick python3dist(pick)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
