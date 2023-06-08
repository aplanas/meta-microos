SUMMARY = "Non-ABI stable API for the Qt 6 Grpc Library"
DESCRIPTION = "This package provides private headers of libQt6Grpc that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-grpc-private-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "9b603b45dbd4995ea44c6a91215f768a70b20a76e74675a113aa46dc62391fb63f453638acbfb35f8dfd220a3a9c0be9d2776873dfd61092decf60c069ad3ff5"

RPROVIDES:${PN} += "qt6-grpc-private-devel qt6-grpc-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Grpc)"

inherit rpm
