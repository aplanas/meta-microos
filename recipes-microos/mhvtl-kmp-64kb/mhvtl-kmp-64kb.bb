SUMMARY = "Virtual Tape Library kernel module"
DESCRIPTION = "This is the kernel module package for the mhvtl Virtual Tape & \
Library package. \
 \
This works in conjunction with the user-land commands and libraries \
to enable tape emulation. \
 \
The vtl module is a stripped-down derivative of the scsi_debug kernel \
module, plus a character device 'back end' to pass the SCSI commands \
through to user-space daemons."
LICENSE = "GPL-2.0-only"

PV = "1.70_release+865.af13081a1ae5_k6.3.1_1"

RPM_NAME = "mhvtl-kmp-64kb-1.70_release+865.af13081a1ae5_k6.3.1_1-2.20.aarch64.rpm"
RPM_HASH = "f2984c060cc068d1431c34a87cff8add5d0de77c412e1496aa9f9d78c8b29f0e5eea0b758fd54d15fdb35216d1639019d73d585100e11e914ae9928d769469d2"

RPROVIDES:${PN} += "kmod(mhvtl.ko) mhvtl-kmp mhvtl-kmp-64kb mhvtl-kmp-64kb(aarch-64) mhvtl-kmp-64kb-k6.3.1_1 multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
