SUMMARY = "A library for working with sizes in bytes"
DESCRIPTION = "The LibBytesize is a C library that facilitates work with sizes in \
bytes, be it parsing the input from users or producing a human-readable \
representation of a size in bytes. This library takes localization into \
account. It also provides support for sizes bigger than MAXUINT64."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "libbytesize1-2.8-1.1.aarch64.rpm"
RPM_HASH = "f4a9030ebd1c29a1d8f29ef9408be5d24c2c4417e3632fa0ac330816cb2f442c421a40e5d2e109c1996989163b4fdb28ffaaf7fdb8928391c167f43946da5da0"

RPROVIDES:${PN} += "libbytesize libbytesize.so.1()(64bit) libbytesize1 libbytesize1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libmpfr.so.6()(64bit) libpcre2-8.so.0()(64bit)"

inherit rpm
