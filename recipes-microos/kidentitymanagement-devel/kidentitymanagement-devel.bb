SUMMARY = "KDE PIM Libraries: Identity Management - development files"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications that make use of multiple email identities."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kidentitymanagement-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "10a3e4e9bda22b75d059613460c71c9320f8a36b7474078897f0e1257953265341d4e0860f9e9014432cec31d5f77bd601d6dbd5e9a034d115ad47e066acd639"

RPROVIDES:${PN} += "cmake(KF5IdentityManagement) cmake(KPim5IdentityManagement) kidentitymanagement-devel kidentitymanagement-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cmake(KF5TextEditTextToSpeech) cmake(KPim5TextEdit) libKPim5IdentityManagement5 libKPim5IdentityManagementWidgets5"

inherit rpm
