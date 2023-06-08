SUMMARY = "Ext2fs library"
DESCRIPTION = "The basic Ext2fs shared library."
LICENSE = "LGPL-2.0-only"

PV = "1.46.5"

RPM_NAME = "libext2fs2-1.46.5-4.3.aarch64.rpm"
RPM_HASH = "fec80b506115771d28f6ae66270e1b8af28279b63591fc67b7b752052bb5c9ad7bd5e5176293ac531630f72634a261f5998e3be86945ce8287e811f10ec29cab"

RPROVIDES:${PN} += "libe2p.so.2()(64bit) libext2fs.so.2()(64bit) libext2fs2 libext2fs2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit)"

inherit rpm
