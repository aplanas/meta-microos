SUMMARY = "Global desktop keyboard shortcuts: Build Environment"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kglobalaccel-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "72038798e54be1f0ae7f1faab8ebafeaad28bdb9ca137ca5ff688ffba12f5f629c0ea1806da481a67c88f6682375bdd11cf038b5e609ffa5f8281d2e23befc83"

RPROVIDES:${PN} += "cmake(KF5GlobalAccel) kglobalaccel-devel kglobalaccel-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5DBus) cmake(Qt5Widgets) extra-cmake-modules libKF5GlobalAccel5 libKF5GlobalAccelPrivate5"

inherit rpm
