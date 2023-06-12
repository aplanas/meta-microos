SUMMARY = "Development Files For Xmorph"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "20060817"

RPM_NAME = "xmorph-devel-20060817-250.9.aarch64.rpm"
RPM_HASH = "13ac6e5461508fc00b799b5142a9aa084592ec167d07cb6fdb6d3d0dd017de749fd0ff840389298ac26fb4e18381f3845c5de6add78a41b64cb8c216538d4bfc"

RPROVIDES:${PN} += "xmorph-devel \
xmorph-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
xmorph"

inherit rpm
