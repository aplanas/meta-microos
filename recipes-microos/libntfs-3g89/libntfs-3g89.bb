SUMMARY = "NTFS Support in Userspace -- Library"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "LGPL-2.1-or-later"

PV = "2022.10.3"

RPM_NAME = "libntfs-3g89-2022.10.3-2.3.aarch64.rpm"
RPM_HASH = "c1995798427bfd3647c7bdeac1801a38b016366414ce05e047c6457aeaa6f65ffd518c45e3bc5c8e5da61d7d9af74483233ab29619050324e7864f8ef32159bf"

RPROVIDES:${PN} += "libntfs-3g.so.89()(64bit) libntfs-3g89 libntfs-3g89(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libhd.so.22()(64bit)"

inherit rpm
