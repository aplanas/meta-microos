SUMMARY = "Development files for libFcitx5GClient"
DESCRIPTION = "This package provides development files for libFcitx5GClient."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5GClient-devel-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "27b2fdaacabf34b68a8bfe51c19444ffea90938d93a5d7624d2f04d8d31e0e99b732f3bc6a49fc038e2eb1c7d3f2a02c79c04258bdb5000b2633aae287cdf27c"

RPROVIDES:${PN} += "cmake(Fcitx5GClient) libFcitx5GClient-devel libFcitx5GClient-devel(aarch-64) pkgconfig(Fcitx5GClient)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libFcitx5GClient2 pkgconfig(gio-2.0) pkgconfig(gobject-2.0)"

inherit rpm
