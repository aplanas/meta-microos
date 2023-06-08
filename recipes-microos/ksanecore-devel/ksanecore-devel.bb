SUMMARY = "Development files for KSaneCore, a Qt library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware. \
This package contains the development files required to use KSaneCore in other \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "ksanecore-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0a7d506594c9e240d88987a398db47846629ba26527b0364fd7655e499e263313a8cca277ff46f291bc6ca34107585ef8a88f650547fa56cea5def8c3367ab2c"

RPROVIDES:${PN} += "cmake(KSaneCore) ksanecore-devel ksanecore-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Wallet) cmake(KF5WidgetsAddons) cmake(Qt5Gui) libKSaneCore1 pkgconfig sane-backends-devel"

inherit rpm
