SUMMARY = "Non-ABI stable API for the Qt 6 StateMachine library"
DESCRIPTION = "This package provides private headers of libQt6StateMachine that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-statemachine-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a3f805d174dc8dbbbf758f4bac011ed6b271feca002b7f61f462118cf06eb16301b82d0461906856bc22a7afd88a603ff7bc220e536b27e1591aba073a366a54"

RPROVIDES:${PN} += "qt6-statemachine-private-devel qt6-statemachine-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6StateMachine) qt6-core-private-devel qt6-gui-private-devel"

inherit rpm
