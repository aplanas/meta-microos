SUMMARY = "Imlib 2 - plugin filters"
DESCRIPTION = "This package has the basic set of plugin filters that come with Imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "imlib2-filters-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "079c3bdb94c0d7cc269d10ebf33fc8278a584e3f4d28e4a9a31e7b49d8e3cd87869ae11b305403e91250da93d4259db3dcff281385cc5493860ec8e85dd927a1"

RPROVIDES:${PN} += "imlib2-filters imlib2-filters(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImlib2-1 libImlib2.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
