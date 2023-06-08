SUMMARY = "Non-ABI stable API for the  Qt6 PlatformSupport library"
DESCRIPTION = "This package provides private headers of libQt6PlatformSupport that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-platformsupport-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "71fa6e31aa7c85f5f512a8a31329dc9d44c3f343f2da11ed7e765e84e0b459e8bf1acea982a8572cbf9c4543ba6bef4a75ad6f9fcedae656e8bd12056ed93c36"

RPROVIDES:${PN} += "qt6-platformsupport-private-devel qt6-platformsupport-private-devel(aarch-64)"
RDEPENDS:${PN} += "qt6-platformsupport-devel-static"

inherit rpm
