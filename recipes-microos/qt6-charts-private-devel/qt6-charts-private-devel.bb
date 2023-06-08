SUMMARY = "Non-ABI stable API for the Qt 6 Charts Library"
DESCRIPTION = "This package provides private headers of libQt6Charts that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-charts-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "77213939e01489ad037a0fd169ac01916d425cafc7d496f1f53a446c8c90af2a2e1f0415d237179e2622f399372722c5cd9dc58ed1f5b6fdc39bca297f7c7467"

RPROVIDES:${PN} += "qt6-charts-private-devel qt6-charts-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Charts)"

inherit rpm
