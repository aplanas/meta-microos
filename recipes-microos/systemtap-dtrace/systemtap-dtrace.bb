SUMMARY = "SystemTap dtrace utility"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the dtrace utility to build provider and probe \
definitions."
LICENSE = "GPL-2.0-or-later"

PV = "4.7"

RPM_NAME = "systemtap-dtrace-4.7-2.1.noarch.rpm"
RPM_HASH = "f6b3cb2ef574ea5ad7a3a5d72660f7c7e327fa06d512d57ab5eff1d7801ef700bed1ea3222ee6154996028777b1faab89b3d214c97386dfc38a8c39e1845f6f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemtap-dtrace"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
