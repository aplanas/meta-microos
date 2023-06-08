SUMMARY = "Framework for browsing and searching media content"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "libgrilo-0_3-0-0.3.15-2.1.aarch64.rpm"
RPM_HASH = "8887572932e8169893527305c442444aa5f43ab7001ace78d4fb459969f50240854d08beaa46300da138bdb675680cd81f6c85f27bccea813327dad7f058e440"

RPROVIDES:${PN} += "grilo libgrilo-0.3.so.0()(64bit) libgrilo-0_3-0 libgrilo-0_3-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
