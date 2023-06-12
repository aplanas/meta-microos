SUMMARY = "Column-based text sort engine"
DESCRIPTION = "Library to sort human readable column-based text output."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libsmartcols1-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "d747dcdea4ecb172262e25c89549c633c8697c2987a33c1ddf3e3d313c786eac0c0ddb8548bd154ca3bbcdbbcecc639eab3e610879f6336a5648e21de6c0c5e5"

RPROVIDES:${PN} += "libsmartcols.so.1()(64bit) libsmartcols.so.1(SMARTCOLS_2.25)(64bit) libsmartcols.so.1(SMARTCOLS_2.27)(64bit) libsmartcols.so.1(SMARTCOLS_2.28)(64bit) libsmartcols.so.1(SMARTCOLS_2.29)(64bit) libsmartcols.so.1(SMARTCOLS_2.30)(64bit) libsmartcols.so.1(SMARTCOLS_2.31)(64bit) libsmartcols.so.1(SMARTCOLS_2.33)(64bit) libsmartcols.so.1(SMARTCOLS_2.34)(64bit) libsmartcols.so.1(SMARTCOLS_2.35)(64bit) libsmartcols.so.1(SMARTCOLS_2.38)(64bit) libsmartcols1 libsmartcols1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
