SUMMARY = "Global desktop keyboard shortcuts: Build Environment"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kglobalaccel-devel-5.106.0-2.1.aarch64.rpm"
RPM_HASH = "2859e0e2c1387dee70fcc5fb232077bc4137b4d0a4cfce030c6ab33bff71c39be8e59d38a70ca81089ab9ddfd86a0eaea7a1c7d3c64634674397de3d364582ba"

RPROVIDES:${PN} += "cmake(KF5GlobalAccel) kglobalaccel-devel kglobalaccel-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5DBus) cmake(Qt5Widgets) extra-cmake-modules libKF5GlobalAccel5 libKF5GlobalAccelPrivate5"

inherit rpm
