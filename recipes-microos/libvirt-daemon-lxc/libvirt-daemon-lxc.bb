SUMMARY = "Server side daemon & driver required to run LXC guests"
DESCRIPTION = "Server side daemon and driver required to manage the virtualization \
capabilities of LXC"
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-lxc-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "147f69ec66ac6d389b28d4d6a412153d43d04bd6b79d78bfe86c0ce6d67f05ee7389b5b5dc4038e39f448cb57a1f50264d3770c9b7b0a3dbddeea9714afeec60"

RPROVIDES:${PN} += "libvirt-daemon-lxc libvirt-daemon-lxc(aarch-64)"
RDEPENDS:${PN} += "libvirt-daemon-common libvirt-daemon-driver-interface libvirt-daemon-driver-lxc libvirt-daemon-driver-network libvirt-daemon-driver-nodedev libvirt-daemon-driver-nwfilter libvirt-daemon-driver-secret libvirt-daemon-driver-storage libvirt-daemon-log libvirt-daemon-proxy"

inherit rpm
