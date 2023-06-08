SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.3.1_1"

RPM_NAME = "vhba-kmp-default-20211218_k6.3.1_1-3.2.aarch64.rpm"
RPM_HASH = "7d42d0480879aea9de0ab1e076b12f3ae71a8c58f05db150ba54af00494a33b0117e0ec2f3e8ea81ec9af249030fa2d6cee2b0ba178694de7ff710ce6d7601de"

RPROVIDES:${PN} += "kmod(vhba.ko) multiversion(kernel) vhba-kmp vhba-kmp-default vhba-kmp-default(aarch-64) vhba-kmp-default-k6.3.1_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
