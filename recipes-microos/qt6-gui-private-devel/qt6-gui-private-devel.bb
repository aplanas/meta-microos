SUMMARY = "Non-ABI stable API for the Qt 6 GUI libraries"
DESCRIPTION = "This package provides private headers of libQt6Gui that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-gui-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "9362f1b2a520e979c9c8867a0ac672d79d5c487aa99e150d47cc5a315068f9340afaac61e375d501f75faab16e57b5fdb40cd4706a97a9bbd5bf53de36133f16"

RPROVIDES:${PN} += "cmake(Qt6EglFSDeviceIntegrationPrivate) cmake(Qt6EglFsKmsGbmSupportPrivate) cmake(Qt6EglFsKmsSupportPrivate) cmake(Qt6XcbQpaPrivate) qt6-gui-private-devel qt6-gui-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6DeviceDiscoverySupportPrivate) cmake(Qt6FbSupportPrivate) cmake(Qt6InputSupportPrivate) libQt6Gui6 pkgconfig(xkbcommon) qt6-core-private-devel qt6-kmssupport-private-devel qt6-opengl-private-devel"

inherit rpm
