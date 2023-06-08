SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DRuntimeRender that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3druntimerender-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c8ce41a4be0710b5d81ec7c974d6bfd7d4b0fed61d74df5cdebb94d2b8694a3b75db96a20d47d2e4d20d189be02c88fdc695e229826393f4779ae062fd57d77c"

RPROVIDES:${PN} += "qt6-quick3druntimerender-private-devel qt6-quick3druntimerender-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DRuntimeRender) qt6-quick-private-devel qt6-quick3dassetimport-private-devel qt6-quick3dutils-private-devel qt6-shadertools-private-devel"

inherit rpm
