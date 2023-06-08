SUMMARY = "Server side daemon & driver required to run QEMU guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of the QEMU emulators"
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-qemu-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "83cdaf36775a22b80298549807c0c7b4186073433a8a95fa2a41f2122b38826f72da3f002a0373c280f6cab895679ed72cf8424cb7d327fe205dafb629989580"

RPROVIDES:${PN} += "libvirt-daemon-qemu libvirt-daemon-qemu(aarch-64)"
RDEPENDS:${PN} += "libvirt-daemon-common libvirt-daemon-driver-interface libvirt-daemon-driver-network libvirt-daemon-driver-nodedev libvirt-daemon-driver-nwfilter libvirt-daemon-driver-qemu libvirt-daemon-driver-secret libvirt-daemon-driver-storage libvirt-daemon-lock libvirt-daemon-log libvirt-daemon-plugin-lockd libvirt-daemon-proxy"

inherit rpm
