SUMMARY = "Column-based text sort engine"
DESCRIPTION = "Library to sort human readable column-based text output."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libsmartcols1-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "c38b1e701aa6f7179aa45c2336cb113868e72f7068a2e5d39a4e84dc3b79a734a25a429f8748b63283ee7c97547e9da2e685bd5c3a0e58e804a1558eda341c08"

RPROVIDES:${PN} += "libsmartcols.so.1()(64bit) libsmartcols.so.1(SMARTCOLS_2.25)(64bit) libsmartcols.so.1(SMARTCOLS_2.27)(64bit) libsmartcols.so.1(SMARTCOLS_2.28)(64bit) libsmartcols.so.1(SMARTCOLS_2.29)(64bit) libsmartcols.so.1(SMARTCOLS_2.30)(64bit) libsmartcols.so.1(SMARTCOLS_2.31)(64bit) libsmartcols.so.1(SMARTCOLS_2.33)(64bit) libsmartcols.so.1(SMARTCOLS_2.34)(64bit) libsmartcols.so.1(SMARTCOLS_2.35)(64bit) libsmartcols.so.1(SMARTCOLS_2.38)(64bit) libsmartcols1 libsmartcols1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
