SUMMARY = "Library to look up words in dictionary sources"
DESCRIPTION = "The matedict library is an engine to look up words in dictionary sources."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "libmatedict6-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "0f8b766f2d94657866cb1bf6ef93d055381e1a480163ea07fb1efaeba64ccd5fd626d4f74ba55a528dc502103bcf4d0185e11ae44fdd04425bb701deb9882a99"

RPROVIDES:${PN} += "libmatedict.so.6()(64bit) libmatedict6 libmatedict6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
