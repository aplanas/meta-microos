SUMMARY = "Guest agent for QEMU"
DESCRIPTION = "This package contains the QEMU guest agent. It is installed in the linux guest \
to provide information and control at the guest OS level."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-guest-agent-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "a0a0a7bb7bab673eb4a3267b9a1113ec9be5d0d80ca31c256ac6dde83f73f19b1966cdc1f31b5116ae3deb9e79b336ab9a2af361af2240f64bc655cd2b6b31ce"

RPROVIDES:${PN} += "qemu-guest-agent qemu-guest-agent(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(kvm) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) liburing.so.2()(64bit) liburing.so.2(LIBURING_2.0)(64bit) udev"

inherit rpm
