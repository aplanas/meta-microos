SUMMARY = "Back-end library for ddccontrol"
DESCRIPTION = "The back-end library enabling DDC/CI access in ddccontrol/gddccontrol."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2+20140105+git9d89d8c"

RPM_NAME = "libddccontrol0-0.4.2+20140105+git9d89d8c-4.14.aarch64.rpm"
RPM_HASH = "4c1d4257056cc7d214a5ae3fc887971f5b5c0f9c4d194dab65c7946d568315d91d8bc182a8cdb1b81a9c5361806c5a811baa79abe62a4f7602e9a86e4f4d35d9"

RPROVIDES:${PN} += "libddccontrol.so.0()(64bit) libddccontrol0 libddccontrol0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ddccontrol-db ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) udev"

inherit rpm
