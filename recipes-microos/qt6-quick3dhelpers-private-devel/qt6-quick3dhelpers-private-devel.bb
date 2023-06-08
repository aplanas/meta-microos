SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpers library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpers that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dhelpers-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1d85b06f6a0825783609ba7c93ec217943d10f70f0be940e9def8b4cc6379094d78da316e8e617c7fba2e170767861fb0c0beb6bca6e6a2945a77dfb193081f1"

RPROVIDES:${PN} += "qt6-quick3dhelpers-private-devel qt6-quick3dhelpers-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DHelpers)"

inherit rpm
