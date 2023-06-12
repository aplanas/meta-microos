SUMMARY = "Qt6 BundledEmbree static library"
DESCRIPTION = "The Qt6 BundledEmbree static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-bundledembree-devel-static-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0c2b12afe87d78ff705f9c5e1c0262ea484f618b16572046229f41a5884e70f49e4e6697dc6de54ddc442937280adb5bf0e242c8e01246aa6f67e696ed09cd3d"

RPROVIDES:${PN} += "cmake(Qt6BundledEmbree) qt6-bundledembree-devel-static qt6-bundledembree-devel-static(aarch-64)"
RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
