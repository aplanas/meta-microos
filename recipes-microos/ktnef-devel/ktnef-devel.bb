SUMMARY = "Development files for libKPim5Tnef5"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktnef-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "de31f086d75a9d982f53c1b5977b0d75499d11dc1e2680e83a30a22f88daad495b17bd6a340263ceea8c3f0e806cc6e6295600ffdc48e6a299d7be0a2a1a9e1c"

RPROVIDES:${PN} += "cmake(KF5Tnef) \
cmake(KPim5Tnef) \
ktnef-devel \
ktnef-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CalendarCore) \
libKPim5Tnef5"

inherit rpm
