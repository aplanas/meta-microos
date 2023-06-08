SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kirigami2-devel-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "3a685d87e49487a367a105255f422f92edc569e028bf04dea6d2576b9fc59a2b237a99912fa606e88baf11e6ea3b30d93ca71e788d0dddf6d76eb1a94d8eb72c"

RPROVIDES:${PN} += "cmake(KF5Kirigami2) kirigami2-devel kirigami2-devel(aarch-64)"
RDEPENDS:${PN} += "kirigami2 libKF5Kirigami2-5"

inherit rpm
