SUMMARY = "Tools for QEMU"
DESCRIPTION = "This package contains various QEMU related tools, including a bridge helper, \
a virtfs helper, ivshmem, disk utilities and scripts for various purposes."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-tools-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "83c633a42347c857a83cd078bdc2e34653353285f0d3ae3f2c0b87a65b393c44c430170c8004eb0ed8391d833a4e25a7d4ba291c50d9ea5e8ca0bec8133ea639"

RPROVIDES:${PN} += "config(qemu-tools) qemu-tools qemu-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/python3 group(kvm) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaio.so.1()(64bit) libaio.so.1(LIBAIO_0.1)(64bit) libaio.so.1(LIBAIO_0.4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap-ng.so.0()(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpathpersist.so.0()(64bit) libmpathpersist.so.0(LIBMPATHPERSIST_2.1.0)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libseccomp.so.2()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) liburing.so.2()(64bit) liburing.so.2(LIBURING_2.0)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) permissions"

inherit rpm
