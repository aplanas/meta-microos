SUMMARY = "The next generation profiling tool for Linux"
DESCRIPTION = "The next generation profiling tool for Linux"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "gprofng-2.40-4.1.aarch64.rpm"
RPM_HASH = "68d4818a833cfc0ddf12d2f09824cdfd2abf1bd2d5a6c92c292beccb9ef60988e06114fd393dd64ae5db1e96938ce0045467a8810ae361bd1d9ac1c175b8a033"

RPROVIDES:${PN} += "gprofng gprofng(aarch-64) libgp-collector.so()(64bit) libgp-collector.so(GLIBC_2.17)(64bit) libgp-collectorAPI.so()(64bit) libgp-collectorAPI.so(GLIBC_2.17)(64bit) libgp-heap.so()(64bit) libgp-heap.so(GLIBC_2.17)(64bit) libgp-iotrace.so()(64bit) libgp-iotrace.so(GLIBC_2.17)(64bit) libgp-sync.so()(64bit) libgp-sync.so(GLIBC_2.17)(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
