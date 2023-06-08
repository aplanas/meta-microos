SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetUtils that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dassetutils-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "dd31bf63b47f428843eb8526ac72e76f985fda59ea9ddc577d78ba2ff46f5174f2a50ec4a0fe9abc5e4c7968006c509ae9ca130a32d324a014fd363c0076780c"

RPROVIDES:${PN} += "qt6-quick3dassetutils-private-devel qt6-quick3dassetutils-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DAssetUtils)"

inherit rpm
