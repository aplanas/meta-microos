SUMMARY = "Development Files for Qt Quick Controls 2 Desktop Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-desktop-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "qqc2-desktop-style-devel-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "566dd7d50a84b384e1e38580a5d4790bfa8034ad128aca2c15b041f3da4cec8eb9b305a72ffd4cbeb0c380511e27279dc66d745370b7431b89a8cd22fb76f998"

RPROVIDES:${PN} += "cmake(KF5QQC2DeskopStyle) cmake(KF5QQC2DesktopStyle) qqc2-desktop-style-devel qqc2-desktop-style-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules qqc2-desktop-style"

inherit rpm
