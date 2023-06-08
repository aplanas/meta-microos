SUMMARY = "Non-ABI stable API for the Qt 6 KMSSupport library"
DESCRIPTION = "This package provides private headers of libQt6KmsSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-kmssupport-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "87a0e9cd2be0c270dcfc84db89c2c7e39f700ba52fbc2db1a2931dacfec8d97c2b2a68152cb630d8d5baef5ba816ae3dfb76e22f3d29f65353998d5abc489383"

RPROVIDES:${PN} += "qt6-kmssupport-private-devel qt6-kmssupport-private-devel(aarch-64)"
RDEPENDS:${PN} += "qt6-kmssupport-devel-static"

inherit rpm
