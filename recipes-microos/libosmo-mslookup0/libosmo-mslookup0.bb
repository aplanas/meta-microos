SUMMARY = "Osmocom MS lookup library"
DESCRIPTION = "This shared library contains routines for looking up mobile subscribers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-mslookup0-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "c3dc6f4579ae8bf2af5c146fe6ed826032e6e0bceae9ce165aaa2b7590c84cb2c09be1c539bf0b96ccf328706caccb5e85c06ba78f83ed6d6b0646816bada128"

RPROVIDES:${PN} += "libosmo-mslookup.so.0()(64bit) libosmo-mslookup0 libosmo-mslookup0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
