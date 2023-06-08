SUMMARY = "Shared library files for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains the shared library files for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.4"

RPM_NAME = "libcallaudio0_1-0-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "a3d292b8df03e96547117c750a72ff3950b74b1c72cb9775295ce7b975efeadd107367cf023f9311f04d9b285184761bd19930fe1c02da35118a77b6a50b91be"

RPROVIDES:${PN} += "libcallaudio-0.1.so.0()(64bit) libcallaudio-0.1.so.0(LIBCALLAUDIO_0_0_0)(64bit) libcallaudio0_1-0 libcallaudio0_1-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
