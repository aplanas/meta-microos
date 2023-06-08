SUMMARY = "QTest accelerator for QEMU"
DESCRIPTION = "QTest is a device emulation testing framework. It is useful to test device \
models. \
 \
This package provides QTest accelerator for testing QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-accel-qtest-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "662ca3149dcbc3ed726ec7d0dfca4180ab1a5e1c63e481325fae3ef69804bb49ea36a96f48fdd92cc89ff2b2b0f1463a7755a3d9880875a30a7a73b689784dce"

RPROVIDES:${PN} += "qemu-accel-qtest qemu-accel-qtest(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
