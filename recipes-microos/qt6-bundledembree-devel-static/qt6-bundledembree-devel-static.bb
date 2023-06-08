SUMMARY = "Qt6 BundledEmbree static library"
DESCRIPTION = "The Qt6 BundledEmbree static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-bundledembree-devel-static-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b596a7fd64289f16df4167b0e4c6fc284be12e9e17e179324765069566b66718158489a3a7fbe37a3498d8e19fa3bbf1eb65d465eceb7838e3fde22cda59a451"

RPROVIDES:${PN} += "cmake(Qt6BundledEmbree) qt6-bundledembree-devel-static qt6-bundledembree-devel-static(aarch-64)"
RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
