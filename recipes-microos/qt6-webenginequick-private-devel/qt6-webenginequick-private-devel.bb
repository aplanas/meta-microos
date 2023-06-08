SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webenginequick-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "5ed5859ed766a51bac04a4d23da5e5968a2292fd6cc3db6ccf103c16609f07e46c8941edc2ef76482cdaf13cb5b47cb53d720fd5bc2917864c0ab4936c531f18"

RPROVIDES:${PN} += "qt6-webenginequick-private-devel qt6-webenginequick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebEngineQuick)"

inherit rpm
