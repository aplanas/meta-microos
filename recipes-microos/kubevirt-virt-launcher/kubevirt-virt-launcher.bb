SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-virt-launcher-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "4ba6c1e1707d6803d40b406a6445a81d20cea2300c11a3631ae31dc5276931b81d32261afbb74b04dc41d21197da214dda882f90b73b667fc70ef2a98c89f2dc"

RPROVIDES:${PN} += "kubevirt-virt-launcher \
kubevirt-virt-launcher(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
libc.so.6(GLIBC_2.34)(64bit) \
libvirt-lxc.so.0()(64bit) \
libvirt-lxc.so.0(LIBVIRT_LXC_1.0.2)(64bit) \
libvirt-lxc.so.0(LIBVIRT_LXC_1.0.4)(64bit) \
libvirt-lxc.so.0(LIBVIRT_LXC_2.0.0)(64bit) \
libvirt-qemu.so.0()(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.10.0)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.8.3)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_0.9.4)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_1.2.3)(64bit) \
libvirt-qemu.so.0(LIBVIRT_QEMU_8.2.0)(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.0.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.1)(64bit) \
libvirt.so.0(LIBVIRT_0.1.4)(64bit) \
libvirt.so.0(LIBVIRT_0.1.5)(64bit) \
libvirt.so.0(LIBVIRT_0.1.9)(64bit) \
libvirt.so.0(LIBVIRT_0.10.0)(64bit) \
libvirt.so.0(LIBVIRT_0.10.2)(64bit) \
libvirt.so.0(LIBVIRT_0.2.0)(64bit) \
libvirt.so.0(LIBVIRT_0.2.1)(64bit) \
libvirt.so.0(LIBVIRT_0.2.3)(64bit) \
libvirt.so.0(LIBVIRT_0.3.0)(64bit) \
libvirt.so.0(LIBVIRT_0.3.2)(64bit) \
libvirt.so.0(LIBVIRT_0.3.3)(64bit) \
libvirt.so.0(LIBVIRT_0.4.0)(64bit) \
libvirt.so.0(LIBVIRT_0.4.1)(64bit) \
libvirt.so.0(LIBVIRT_0.4.2)(64bit) \
libvirt.so.0(LIBVIRT_0.4.5)(64bit) \
libvirt.so.0(LIBVIRT_0.5.0)(64bit) \
libvirt.so.0(LIBVIRT_0.6.0)(64bit) \
libvirt.so.0(LIBVIRT_0.6.1)(64bit) \
libvirt.so.0(LIBVIRT_0.6.3)(64bit) \
libvirt.so.0(LIBVIRT_0.6.4)(64bit) \
libvirt.so.0(LIBVIRT_0.7.0)(64bit) \
libvirt.so.0(LIBVIRT_0.7.1)(64bit) \
libvirt.so.0(LIBVIRT_0.7.2)(64bit) \
libvirt.so.0(LIBVIRT_0.7.3)(64bit) \
libvirt.so.0(LIBVIRT_0.7.5)(64bit) \
libvirt.so.0(LIBVIRT_0.7.7)(64bit) \
libvirt.so.0(LIBVIRT_0.8.0)(64bit) \
libvirt.so.0(LIBVIRT_0.8.1)(64bit) \
libvirt.so.0(LIBVIRT_0.8.2)(64bit) \
libvirt.so.0(LIBVIRT_0.8.5)(64bit) \
libvirt.so.0(LIBVIRT_0.8.6)(64bit) \
libvirt.so.0(LIBVIRT_0.8.8)(64bit) \
libvirt.so.0(LIBVIRT_0.9.0)(64bit) \
libvirt.so.0(LIBVIRT_0.9.10)(64bit) \
libvirt.so.0(LIBVIRT_0.9.11)(64bit) \
libvirt.so.0(LIBVIRT_0.9.13)(64bit) \
libvirt.so.0(LIBVIRT_0.9.2)(64bit) \
libvirt.so.0(LIBVIRT_0.9.3)(64bit) \
libvirt.so.0(LIBVIRT_0.9.4)(64bit) \
libvirt.so.0(LIBVIRT_0.9.5)(64bit) \
libvirt.so.0(LIBVIRT_0.9.7)(64bit) \
libvirt.so.0(LIBVIRT_0.9.8)(64bit) \
libvirt.so.0(LIBVIRT_0.9.9)(64bit) \
libvirt.so.0(LIBVIRT_1.0.0)(64bit) \
libvirt.so.0(LIBVIRT_1.0.1)(64bit) \
libvirt.so.0(LIBVIRT_1.0.2)(64bit) \
libvirt.so.0(LIBVIRT_1.0.3)(64bit) \
libvirt.so.0(LIBVIRT_1.0.5)(64bit) \
libvirt.so.0(LIBVIRT_1.0.6)(64bit) \
libvirt.so.0(LIBVIRT_1.1.0)(64bit) \
libvirt.so.0(LIBVIRT_1.1.1)(64bit) \
libvirt.so.0(LIBVIRT_1.1.3)(64bit) \
libvirt.so.0(LIBVIRT_1.2.1)(64bit) \
libvirt.so.0(LIBVIRT_1.2.11)(64bit) \
libvirt.so.0(LIBVIRT_1.2.12)(64bit) \
libvirt.so.0(LIBVIRT_1.2.14)(64bit) \
libvirt.so.0(LIBVIRT_1.2.15)(64bit) \
libvirt.so.0(LIBVIRT_1.2.16)(64bit) \
libvirt.so.0(LIBVIRT_1.2.17)(64bit) \
libvirt.so.0(LIBVIRT_1.2.19)(64bit) \
libvirt.so.0(LIBVIRT_1.2.3)(64bit) \
libvirt.so.0(LIBVIRT_1.2.5)(64bit) \
libvirt.so.0(LIBVIRT_1.2.6)(64bit) \
libvirt.so.0(LIBVIRT_1.2.7)(64bit) \
libvirt.so.0(LIBVIRT_1.2.8)(64bit) \
libvirt.so.0(LIBVIRT_1.2.9)(64bit) \
libvirt.so.0(LIBVIRT_1.3.3)(64bit) \
libvirt.so.0(LIBVIRT_2.0.0)(64bit) \
libvirt.so.0(LIBVIRT_2.2.0)(64bit) \
libvirt.so.0(LIBVIRT_3.0.0)(64bit) \
libvirt.so.0(LIBVIRT_3.1.0)(64bit) \
libvirt.so.0(LIBVIRT_3.4.0)(64bit) \
libvirt.so.0(LIBVIRT_3.7.0)(64bit) \
libvirt.so.0(LIBVIRT_3.9.0)(64bit) \
libvirt.so.0(LIBVIRT_4.1.0)(64bit) \
libvirt.so.0(LIBVIRT_4.10.0)(64bit) \
libvirt.so.0(LIBVIRT_4.4.0)(64bit) \
libvirt.so.0(LIBVIRT_4.5.0)(64bit) \
libvirt.so.0(LIBVIRT_5.10.0)(64bit) \
libvirt.so.0(LIBVIRT_5.2.0)(64bit) \
libvirt.so.0(LIBVIRT_5.5.0)(64bit) \
libvirt.so.0(LIBVIRT_5.6.0)(64bit) \
libvirt.so.0(LIBVIRT_5.7.0)(64bit) \
libvirt.so.0(LIBVIRT_5.8.0)(64bit) \
libvirt.so.0(LIBVIRT_6.0.0)(64bit) \
libvirt.so.0(LIBVIRT_6.10.0)(64bit) \
libvirt.so.0(LIBVIRT_7.1.0)(64bit) \
libvirt.so.0(LIBVIRT_7.2.0)(64bit) \
libvirt.so.0(LIBVIRT_7.3.0)(64bit) \
libvirt.so.0(LIBVIRT_7.7.0)(64bit) \
libvirt.so.0(LIBVIRT_7.8.0)(64bit) \
libvirt.so.0(LIBVIRT_8.0.0)(64bit) \
libvirt.so.0(LIBVIRT_8.4.0)(64bit) \
libvirt.so.0(LIBVIRT_8.5.0)(64bit) \
libvirt.so.0(LIBVIRT_9.0.0)(64bit)"

inherit rpm
