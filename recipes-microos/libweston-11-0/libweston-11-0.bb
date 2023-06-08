SUMMARY = "The Weston compositor as a shared library"
DESCRIPTION = "The libweston library is intended for use by other compositor efforts \
(projects) that want to more easily utilize Weston's internal \
functionalities. Weston's own reference compositor also makes use of \
this."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "11"

RPM_NAME = "libweston-11-0-11-3.1.aarch64.rpm"
RPM_HASH = "db459744f6fcd9f266f703d7fece7eafac2356d8ea65174d61c148dacfa71e5ea9a1761bb7e623e7dfddd5ddd470b00ade9df8335d03484ec530ec56a9102b3e"

RPROVIDES:${PN} += "libweston-11-0 libweston-11-0(aarch-64) libweston-11.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libpixman-1.so.0()(64bit) libwayland-server.so.0()(64bit) libweston-11 libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
