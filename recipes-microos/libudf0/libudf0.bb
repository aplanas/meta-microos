SUMMARY = "Library for working with Universal Disk Format filesystems"
DESCRIPTION = "This library is made to read and write UDF filesystems, which are mainly \
used on DVDs."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libudf0-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "a76ed3f5437177e30e8267e5cd40cfa8946a2177ea79c8ffebb71cc1d1b384aa1b1237b42b566e3521744005177b7fa0ddf72563b93f1cace86295490e851c95"

RPROVIDES:${PN} += "libudf.so.0()(64bit) libudf0 libudf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdio.so.19()(64bit) libcdio.so.19(CDIO_19)(64bit)"

inherit rpm
