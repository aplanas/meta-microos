SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with Qt Quick 3D."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtquick3d-devel-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "d3b7c2f0e37b768c65577754b70e5b79da7903d086c27758be1b6dca72bfa8e822d741138416a9d031a960b233b76b6d230dfb27ad83a50e86afa85a98c71f84"

RPROVIDES:${PN} += "cmake(Qt5Quick3D) \
cmake(Qt5Quick3DAssetImport) \
cmake(Qt5Quick3DRender) \
cmake(Qt5Quick3DRuntimeRender) \
cmake(Qt5Quick3DUtils) \
libqt5-qtquick3d-devel \
libqt5-qtquick3d-devel(aarch-64) \
pkgconfig(Qt5Quick3D) \
pkgconfig(Qt5Quick3DAssetImport) \
pkgconfig(Qt5Quick3DRender) \
pkgconfig(Qt5Quick3DRuntimeRender) \
pkgconfig(Qt5Quick3DUtils)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Quick3D5 \
libQt5Quick3DAssetImport5 \
libqt5-qtquick3d-tools \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Qml) \
pkgconfig(Qt5Quick) \
pkgconfig(Qt5Quick3DAssetImport) \
pkgconfig(Qt5Quick3DRender) \
pkgconfig(Qt5Quick3DRuntimeRender) \
pkgconfig(Qt5Quick3DUtils)"

inherit rpm
