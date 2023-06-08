SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickcontrols2impl-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "4ff44ff00fca9e56104b7c7aaa87811d4ae2be37953e1e432a380bda6b26c8e747c0996be910609afccb84f21af2395fe15b30888bd6107ffa1f2eed7c9174cb"

RPROVIDES:${PN} += "qt6-quickcontrols2impl-private-devel qt6-quickcontrols2impl-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickControls2Impl)"

inherit rpm
