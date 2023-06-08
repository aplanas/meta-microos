SUMMARY = "Qt 6 CoAP library - Development files"
DESCRIPTION = "Development files for the Qt 6 CoAP library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-coap-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "edd80bcdc6d89f40c01bb915553b9c21f744df4dddf5a9e4ad7010d8b617ae315f61e293e345594d7e963f83b3142b0262505dac5bfc72236479dbf12473c665"

RPROVIDES:${PN} += "cmake(Qt6Coap) pkgconfig(Qt6Coap) qt6-coap-devel qt6-coap-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) libQt6Coap6 pkgconfig(Qt6Core)"

inherit rpm
