SUMMARY = "Miscellaneous scripts for X"
DESCRIPTION = "This package contains miscellaneous scripts for X, like xon, a script \
to start an X program on a remote machine."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xorg-scripts-1.0.1-10.17.noarch.rpm"
RPM_HASH = "26fb32d932487d6ddcd151e4b01789269ce69f73439ad772f54ec2e34429dc44f9ac1ffbe146a84a0e2574f6350584dfb0607a600666861db23b4406ec8d4e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-scripts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
