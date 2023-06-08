SUMMARY = "Non-ABI stable API for the Qt 6 StateMachineQml library"
DESCRIPTION = "This package provides private headers of libQt6StateMachineQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-statemachineqml-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5aa17ddc80a10fd5a035f2020ee381dd1835c6384f66461ecb32e6476f31e475407a31f2eb4ad1338ddc98ec7082160923ea9ba8ec8f7ac0b150fca0a59e25c4"

RPROVIDES:${PN} += "qt6-statemachineqml-private-devel qt6-statemachineqml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6StateMachineQml) qt6-core-private-devel qt6-gui-private-devel"

inherit rpm
