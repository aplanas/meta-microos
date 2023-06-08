SUMMARY = "Library for Capabilities (linux-privs) Support"
DESCRIPTION = "Capabilities are a measure to limit the omnipotence of the superuser. \
Currently a program started by root or setuid root has the power to do \
anything. Capabilities (Linux-Privs) provide a more fine-grained access \
control. Without kernel patches, you can use this library to drop \
capabilities within setuid binaries. If you use patches, this can be \
done automatically by the kernel."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.68"

RPM_NAME = "libpsx2-2.68-1.1.aarch64.rpm"
RPM_HASH = "29e40844c5a6eb1baabd567444b80d271a86f1b2b97512dc4ff80a50c55aab57f8fc6095620b57d3049977fc0a037ebb1dfbdab0b0f68718932bd80f5b8f5465"

RPROVIDES:${PN} += "libpsx.so.2()(64bit) libpsx2 libpsx2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
