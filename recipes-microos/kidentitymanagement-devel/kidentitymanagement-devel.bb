SUMMARY = "KDE PIM Libraries: Identity Management - development files"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications that make use of multiple email identities."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kidentitymanagement-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "48cb5a0ebfa922ac3aa2c60b4c11844d1e04c7efa7c15dfa08a6760dfaf0cd58efacbe8c0d355265297f9728327c8733190b0a8d8986939b8daada11f0a7e7dc"

RPROVIDES:${PN} += "cmake(KF5IdentityManagement) cmake(KPim5IdentityManagement) kidentitymanagement-devel kidentitymanagement-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cmake(KF5TextEditTextToSpeech) cmake(KPim5TextEdit) libKPim5IdentityManagement5 libKPim5IdentityManagementWidgets5"

inherit rpm
