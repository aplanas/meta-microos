SUMMARY = "Client side utilities of the libvirt library"
DESCRIPTION = "The client binaries needed to access the virtualization \
capabilities of recent versions of Linux (and other OSes)."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-client-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "f947b4f55d6c79a3e2660e7088ba4c662a9a21e850f5a78c85b8641047f07a4191417ee28ee3c1f2d6a89df2688b5f1a7bbe8359b04b0457156e9f83f75c78db"

RPROVIDES:${PN} += "libvirt-client libvirt-client(aarch-64)"
RDEPENDS:${PN} += "/bin/sh bash-completion cyrus-sasl gnutls ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libreadline.so.8()(64bit) libvirt-libs libvirt-lxc.so.0()(64bit) libvirt-lxc.so.0(LIBVIRT_LXC_1.0.2)(64bit) libvirt-lxc.so.0(LIBVIRT_LXC_1.0.4)(64bit) libvirt-lxc.so.0(LIBVIRT_LXC_2.0.0)(64bit) libvirt-qemu.so.0()(64bit) libvirt-qemu.so.0(LIBVIRT_QEMU_0.10.0)(64bit) libvirt-qemu.so.0(LIBVIRT_QEMU_0.8.3)(64bit) libvirt-qemu.so.0(LIBVIRT_QEMU_0.9.4)(64bit) libvirt-qemu.so.0(LIBVIRT_QEMU_1.2.3)(64bit) libvirt-qemu.so.0(LIBVIRT_QEMU_8.2.0)(64bit) libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_0.0.3)(64bit) libvirt.so.0(LIBVIRT_0.1.0)(64bit) libvirt.so.0(LIBVIRT_0.1.1)(64bit) libvirt.so.0(LIBVIRT_0.1.4)(64bit) libvirt.so.0(LIBVIRT_0.1.5)(64bit) libvirt.so.0(LIBVIRT_0.1.9)(64bit) libvirt.so.0(LIBVIRT_0.10.0)(64bit) libvirt.so.0(LIBVIRT_0.10.2)(64bit) libvirt.so.0(LIBVIRT_0.2.0)(64bit) libvirt.so.0(LIBVIRT_0.2.1)(64bit) libvirt.so.0(LIBVIRT_0.2.3)(64bit) libvirt.so.0(LIBVIRT_0.3.0)(64bit) libvirt.so.0(LIBVIRT_0.3.2)(64bit) libvirt.so.0(LIBVIRT_0.3.3)(64bit) libvirt.so.0(LIBVIRT_0.4.0)(64bit) libvirt.so.0(LIBVIRT_0.4.1)(64bit) libvirt.so.0(LIBVIRT_0.4.5)(64bit) libvirt.so.0(LIBVIRT_0.5.0)(64bit) libvirt.so.0(LIBVIRT_0.6.1)(64bit) libvirt.so.0(LIBVIRT_0.6.3)(64bit) libvirt.so.0(LIBVIRT_0.6.4)(64bit) libvirt.so.0(LIBVIRT_0.7.0)(64bit) libvirt.so.0(LIBVIRT_0.7.1)(64bit) libvirt.so.0(LIBVIRT_0.7.2)(64bit) libvirt.so.0(LIBVIRT_0.7.3)(64bit) libvirt.so.0(LIBVIRT_0.7.5)(64bit) libvirt.so.0(LIBVIRT_0.7.7)(64bit) libvirt.so.0(LIBVIRT_0.8.0)(64bit) libvirt.so.0(LIBVIRT_0.8.1)(64bit) libvirt.so.0(LIBVIRT_0.8.2)(64bit) libvirt.so.0(LIBVIRT_0.8.5)(64bit) libvirt.so.0(LIBVIRT_0.8.6)(64bit) libvirt.so.0(LIBVIRT_0.8.8)(64bit) libvirt.so.0(LIBVIRT_0.9.0)(64bit) libvirt.so.0(LIBVIRT_0.9.10)(64bit) libvirt.so.0(LIBVIRT_0.9.11)(64bit) libvirt.so.0(LIBVIRT_0.9.13)(64bit) libvirt.so.0(LIBVIRT_0.9.2)(64bit) libvirt.so.0(LIBVIRT_0.9.3)(64bit) libvirt.so.0(LIBVIRT_0.9.4)(64bit) libvirt.so.0(LIBVIRT_0.9.5)(64bit) libvirt.so.0(LIBVIRT_0.9.7)(64bit) libvirt.so.0(LIBVIRT_0.9.8)(64bit) libvirt.so.0(LIBVIRT_0.9.9)(64bit) libvirt.so.0(LIBVIRT_1.0.0)(64bit) libvirt.so.0(LIBVIRT_1.0.1)(64bit) libvirt.so.0(LIBVIRT_1.0.2)(64bit) libvirt.so.0(LIBVIRT_1.0.3)(64bit) libvirt.so.0(LIBVIRT_1.0.5)(64bit) libvirt.so.0(LIBVIRT_1.1.0)(64bit) libvirt.so.0(LIBVIRT_1.1.1)(64bit) libvirt.so.0(LIBVIRT_1.1.3)(64bit) libvirt.so.0(LIBVIRT_1.2.1)(64bit) libvirt.so.0(LIBVIRT_1.2.11)(64bit) libvirt.so.0(LIBVIRT_1.2.12)(64bit) libvirt.so.0(LIBVIRT_1.2.14)(64bit) libvirt.so.0(LIBVIRT_1.2.15)(64bit) libvirt.so.0(LIBVIRT_1.2.16)(64bit) libvirt.so.0(LIBVIRT_1.2.17)(64bit) libvirt.so.0(LIBVIRT_1.2.19)(64bit) libvirt.so.0(LIBVIRT_1.2.3)(64bit) libvirt.so.0(LIBVIRT_1.2.5)(64bit) libvirt.so.0(LIBVIRT_1.2.6)(64bit) libvirt.so.0(LIBVIRT_1.2.7)(64bit) libvirt.so.0(LIBVIRT_1.2.8)(64bit) libvirt.so.0(LIBVIRT_1.2.9)(64bit) libvirt.so.0(LIBVIRT_1.3.3)(64bit) libvirt.so.0(LIBVIRT_2.0.0)(64bit) libvirt.so.0(LIBVIRT_2.2.0)(64bit) libvirt.so.0(LIBVIRT_3.0.0)(64bit) libvirt.so.0(LIBVIRT_3.1.0)(64bit) libvirt.so.0(LIBVIRT_3.4.0)(64bit) libvirt.so.0(LIBVIRT_3.7.0)(64bit) libvirt.so.0(LIBVIRT_3.9.0)(64bit) libvirt.so.0(LIBVIRT_4.10.0)(64bit) libvirt.so.0(LIBVIRT_4.4.0)(64bit) libvirt.so.0(LIBVIRT_4.5.0)(64bit) libvirt.so.0(LIBVIRT_5.10.0)(64bit) libvirt.so.0(LIBVIRT_5.2.0)(64bit) libvirt.so.0(LIBVIRT_5.5.0)(64bit) libvirt.so.0(LIBVIRT_5.6.0)(64bit) libvirt.so.0(LIBVIRT_5.7.0)(64bit) libvirt.so.0(LIBVIRT_6.0.0)(64bit) libvirt.so.0(LIBVIRT_6.10.0)(64bit) libvirt.so.0(LIBVIRT_7.1.0)(64bit) libvirt.so.0(LIBVIRT_7.2.0)(64bit) libvirt.so.0(LIBVIRT_7.3.0)(64bit) libvirt.so.0(LIBVIRT_7.7.0)(64bit) libvirt.so.0(LIBVIRT_7.8.0)(64bit) libvirt.so.0(LIBVIRT_8.0.0)(64bit) libvirt.so.0(LIBVIRT_8.5.0)(64bit) libvirt.so.0(LIBVIRT_9.0.0)(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
