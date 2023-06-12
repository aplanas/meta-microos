SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetImport library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetImport that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetimport-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c14a8fb1598d416f80fd01e7e5a55f4be78b2430579fa4aea4527d6d233eeb290560b28731d12604335232a61bb2330820d5c6ca0ac7782dba7aef9a1cf5aa99"

RPROVIDES:${PN} += "qt6-quick3dassetimport-private-devel qt6-quick3dassetimport-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DAssetImport) qt6-core-private-devel qt6-quick3dutils-private-devel"

inherit rpm
