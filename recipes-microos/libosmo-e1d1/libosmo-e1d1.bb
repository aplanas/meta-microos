SUMMARY = "Osmocom E1 daemon protocol library"
DESCRIPTION = "Osmocom E1 Daemon Protocol Library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libosmo-e1d1-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "8f86471243e69dfda8557988ae791d7f0e953dbe983d0db9206920e6dd1aca5e279b6a3290f898331622060738e26a979b517cfbebb3684edeb588ca74859641"

RPROVIDES:${PN} += "libosmo-e1d.so.1()(64bit) libosmo-e1d1 libosmo-e1d1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.20()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
