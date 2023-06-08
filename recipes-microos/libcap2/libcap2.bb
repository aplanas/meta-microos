SUMMARY = "Library for Capabilities (linux-privs) Support"
DESCRIPTION = "Capabilities are a measure to limit the omnipotence of the superuser. \
Currently a program started by root or setuid root has the power to do \
anything. Capabilities (Linux-Privs) provide a more fine-grained access \
control. Without kernel patches, you can use this library to drop \
capabilities within setuid binaries. If you use patches, this can be \
done automatically by the kernel."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.68"

RPM_NAME = "libcap2-2.68-1.1.aarch64.rpm"
RPM_HASH = "8e533dea03c8a1214d38c15fde77050e97400205f7200af78cef84d89607c0eb3bd44e40d4170445d953e7148adb35575413e99b3b3c84570439795c787a1868"

RPROVIDES:${PN} += "libcap.so.2()(64bit) libcap2 libcap2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
