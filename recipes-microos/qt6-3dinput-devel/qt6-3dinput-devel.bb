SUMMARY = "Development files for the Qt 6 3DInput library"
DESCRIPTION = "Development files for the Qt 6 3DInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dinput-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "e6e9c91f9e8155ca1b1873658ce929c809ac4eb6f9a83da9fa6aeffd75f5501047cb1a124d6014be08839e4ae76c20e3a856d1ad1b815c841a918dbb20d2db64"

RPROVIDES:${PN} += "cmake(Qt63DInput) pkgconfig(Qt63DInput) qt6-3dinput-devel qt6-3dinput-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) libQt63DInput6 pkgconfig(Qt63DCore) pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
