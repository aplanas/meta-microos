SUMMARY = "A utility for configuring serial ports"
DESCRIPTION = "Setserial is a basic system utility for displaying or setting serial \
port information. Setserial can reveal and allow you to alter the I/O \
port and IRQ that a particular serial device is using."
LICENSE = "GPL-2.0+"

PV = "2.17"

RPM_NAME = "setserial-2.17-743.26.aarch64.rpm"
RPM_HASH = "c40c0b2a9ae21723184710f64a96b74bf37978447836815a728ee6a2f0e9fc2d79e735619f656523df7283d55de69e18b4a8b79f04cc1feadd0a8e1d64c657e3"

RPROVIDES:${PN} += "setserial setserial(aarch-64) util:/sbin/setserial"
RDEPENDS:${PN} += "/sbin/isserial ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
