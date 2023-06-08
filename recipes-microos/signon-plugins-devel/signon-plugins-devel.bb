SUMMARY = "Development files for the Single Sign On Framework's plugins"
DESCRIPTION = "This package contains the development files necessary for creating plugins for \
the Single Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signon-plugins-devel-8.60-2.18.aarch64.rpm"
RPM_HASH = "bb0935d2eca1ebb7b7be47168f6cae99605c8c6f68e1da5504509dd8586f3cd5dbaca9412d157120ee767590ca1980e1433492464e6c859b44f353a9192dadef"

RPROVIDES:${PN} += "pkgconfig(signon-plugins) pkgconfig(signon-plugins-common) signon-plugins-devel signon-plugins-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsignon-qt5-devel pkgconfig(libsignon-qt5) signon-plugins"

inherit rpm
