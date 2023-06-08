SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kmbox-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6531d4108d3c6aada467ad44a2357fb479260400d12a59733b974f1db7c285b1490d21698825fbdbf7ada991df377f47f6e1a20b0e2acaacb31c79ae7a6ff209"

RPROVIDES:${PN} += "cmake(KF5Mbox) cmake(KPim5Mbox) kmbox-devel kmbox-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KPim5Mime) libKPim5Mbox5"

inherit rpm
