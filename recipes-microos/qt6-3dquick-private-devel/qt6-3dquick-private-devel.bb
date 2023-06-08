SUMMARY = "Non-ABI stable API for the Qt 6 3DQuick library"
DESCRIPTION = "This package provides private headers of libQt63DQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquick-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ba78f48f9f80603167170bddd48d58d07bb08f9e910b17239cfb6c028ac2c217a482bdad226da62a49e517b3e7c3b8691764f10e6fff613c8d2c805796833a8a"

RPROVIDES:${PN} += "qt6-3dquick-private-devel qt6-3dquick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DQuick)"

inherit rpm
