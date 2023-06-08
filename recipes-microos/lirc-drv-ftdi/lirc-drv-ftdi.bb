SUMMARY = "Ftdi LIRC User-Space Driver"
DESCRIPTION = "LIRC user-space driver which works together with the kernel, providing \
full support for the ftdi device."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-drv-ftdi-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "29861d174a6d643ed587d57645e2b427d35c59e8003d1471e5ac7312c5aebaabfc89a0cfedd59a625a32badfba1e50bab91bc4a802fbb2c3e70bc632e6f39977"

RPROVIDES:${PN} += "lirc-drv-ftdi lirc-drv-ftdi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libftdi1.so.2()(64bit) liblirc.so.0()(64bit) liblirc_driver.so.0()(64bit) libusb-1.0.so.0()(64bit) lirc-core"

inherit rpm
