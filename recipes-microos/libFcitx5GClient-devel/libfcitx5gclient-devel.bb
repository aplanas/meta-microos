SUMMARY = "Development files for libFcitx5GClient"
DESCRIPTION = "This package provides development files for libFcitx5GClient."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.22"

RPM_NAME = "libFcitx5GClient-devel-5.0.22-1.3.aarch64.rpm"
RPM_HASH = "abde28f185c2d4bf30a45db1c1a8960a5d6bc9420a0d6573d3edfcd1adf51d80256337b8dccbffe4399c5fd3e04085c7b977bea107f479cf5403b059ad650f79"

RPROVIDES:${PN} += "cmake(Fcitx5GClient) libFcitx5GClient-devel libFcitx5GClient-devel(aarch-64) pkgconfig(Fcitx5GClient)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libFcitx5GClient2 pkgconfig(gio-2.0) pkgconfig(gobject-2.0)"

inherit rpm
