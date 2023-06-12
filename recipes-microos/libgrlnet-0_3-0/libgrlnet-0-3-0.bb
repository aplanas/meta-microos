SUMMARY = "Framework for browsing and searching media content -- Networking Helper Library"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "libgrlnet-0_3-0-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "85cbe3220dc47b4ed47b9eac762a0f78eeedb06ca0bec2b6d8330356b798e3eee7eaa4dd202704d7ab839d7b9b6cc36cc3648940b135fc6aafaa323ea0d462f5"

RPROVIDES:${PN} += "libgrlnet-0.3.so.0()(64bit) \
libgrlnet-0_3-0 \
libgrlnet-0_3-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgrilo-0.3.so.0()(64bit) \
libsoup-3.0.so.0()(64bit)"

inherit rpm
