SUMMARY = "Qt6 Quick3DHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dhelpers-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "37024c12a43782dd74610de9dc9fd527443f658fc9d2232550fda11c50cf67ad04be1e0a02bf2e9fbbb41fe1ca545370dc4952ffb89f16e21a6d9f47bf7ceb13"

RPROVIDES:${PN} += "cmake(Qt6Quick3DHelpers) pkgconfig(Qt6Quick3DHelpers) qt6-quick3dhelpers-devel qt6-quick3dhelpers-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) libQt6Quick3DHelpers6 pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) pkgconfig(Qt6Quick3D) qt6-quick3d-private-devel"

inherit rpm
