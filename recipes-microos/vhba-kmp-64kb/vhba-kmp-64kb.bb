SUMMARY = "Virtual SCSI Host Bus adapter"
DESCRIPTION = "A Linux kernel module implementing a virtual SCSI Host Bus Adapter to \
act as a low-level SCSI driver and which provides the SCSI layer with \
a virtual SCSI adapter which can have multiple virtual devices. It is \
part of the userspace cdemu suite, CD/DVD-ROM device emulator for \
Linux."
LICENSE = "GPL-2.0-or-later"

PV = "20211218_k6.3.1_1"

RPM_NAME = "vhba-kmp-64kb-20211218_k6.3.1_1-3.2.aarch64.rpm"
RPM_HASH = "260ba0ebd934826f956b6c3c5bbe35a8899d1520eab3137afe4b6e8d1cc6489b50e8681bb982c25476e4004ef466f4f4f29af952c6ff112a13aedc0e4e3aae62"

RPROVIDES:${PN} += "kmod(vhba.ko) multiversion(kernel) vhba-kmp vhba-kmp-64kb vhba-kmp-64kb(aarch-64) vhba-kmp-64kb-k6.3.1_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
