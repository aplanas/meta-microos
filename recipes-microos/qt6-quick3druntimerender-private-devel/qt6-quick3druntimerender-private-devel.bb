SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DRuntimeRender library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DRuntimeRender that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3druntimerender-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d1c95fbcb0f83fd579f864e098df16a982f4e13d202e1d404eb6c09231db8dd69ad782f925dcae7f4149e4d0b055e49aaca798a9cf938bd44a82a19e94417f58"

RPROVIDES:${PN} += "qt6-quick3druntimerender-private-devel \
qt6-quick3druntimerender-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DRuntimeRender) \
qt6-quick-private-devel \
qt6-quick3dassetimport-private-devel \
qt6-quick3dutils-private-devel \
qt6-shadertools-private-devel"

inherit rpm
