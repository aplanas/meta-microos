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

RPM_NAME = "mhvtl-kmp-default-1.70_release+865.af13081a1ae5_k6.3.1_1-2.20.aarch64.rpm"
RPM_HASH = "09004313b6740d04e21b279dd1be2e5630e0d3b75fb6e671b3b5b913ffe4481e4788ce58d464ccba9a0d045201f51eae8eeeacc7577974dbb017d911d370436b"

RPROVIDES:${PN} += "kmod(mhvtl.ko) mhvtl-kmp mhvtl-kmp-default mhvtl-kmp-default(aarch-64) mhvtl-kmp-default-k6.3.1_1 multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
