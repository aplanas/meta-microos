SUMMARY = "Build environment for the KDE PIM MIME libraries"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kmime-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6f7cc197e87ee446cbcbcf045d7af03d790c83203069065b12c4f21f015de9d32a65efdb7e2272cb067b1e12e0de8489808636ae038fc51e4924f59e43fa3b93"

RPROVIDES:${PN} += "cmake(KF5Mime) cmake(KPim5Mime) kmime-devel kmime-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Codecs) libKPim5Mime5"

inherit rpm
