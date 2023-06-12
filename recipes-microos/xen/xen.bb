SUMMARY = "Xen Virtualization: Hypervisor (aka VMM aka Microkernel)"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the Xen Hypervisor. (tm) \
 \
[Hypervisor is a trademark of IBM]"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_04"

RPM_NAME = "xen-4.17.1_04-1.1.aarch64.rpm"
RPM_HASH = "493f8a51a39cb3bf9b6ac2171f1be21d76c85fdfa8847eccc91b3d2d948597762f02bf936fcf32da4e68e5cd6795b93fbf19274e8f2075f1fd59d273a805a185"

RPROVIDES:${PN} += "installhint(reboot-needed) xen xen(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup systemd"

inherit rpm
