SUMMARY = "Xen Virtualization: Hypervisor (aka VMM aka Microkernel)"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the Xen Hypervisor. (tm) \
 \
[Hypervisor is a trademark of IBM]"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_02"

RPM_NAME = "xen-4.17.1_02-1.1.aarch64.rpm"
RPM_HASH = "bd5fbc540af96916af2a2e5316506f22fe31bd1b25319bef31aae41135cb5d07b30ddfa80f93ffc4a588b7225e2d9f40b99d441a22b3e1de3a4520789c2504a9"

RPROVIDES:${PN} += "installhint(reboot-needed) xen xen(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup systemd"

inherit rpm
