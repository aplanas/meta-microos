SUMMARY = "Tools for the X Window System"
DESCRIPTION = "Some useful tools for the X Window System."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.1"

RPM_NAME = "x11-tools-0.1-213.2.noarch.rpm"
RPM_HASH = "791ce379aa5f94f97eadf2586ca973dba04c838413e104d2fc360c9075795c50896373417571c21549512b0fd60122e6f475e881cd4c713bae84b283198c8d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "3ddiag x11-tools xf86tools"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup"

inherit rpm
