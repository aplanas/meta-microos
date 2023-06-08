SUMMARY = "Non-ABI stable API for the Qt 6 DeclarativeOpcua library"
DESCRIPTION = "This package provides private headers of libDeclarativeOpcua that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-declarativeopcua-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9606f5b8f465394eab98c898ec20c5363b772c504eeabde43d346950467fa39c563c0f53501b3f6c4784b768393e0646e3cdaa51706b824cd07045a1c49cc2b8"

RPROVIDES:${PN} += "cmake(Qt6DeclarativeOpcua) pkgconfig(Qt6DeclarativeOpcua) qt6-declarativeopcua-private-devel qt6-declarativeopcua-private-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6OpcUa) cmake(Qt6Quick) libQt6DeclarativeOpcua6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpcUa) pkgconfig(Qt6Quick)"

inherit rpm
