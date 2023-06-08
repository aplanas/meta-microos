SUMMARY = "Utilities for inspecting MS-DOS partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsmbr to \
inspect MS-DOS partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr-tools-20210509-4.7.aarch64.rpm"
RPM_HASH = "8ef5b26febe5d11e3a4c3d5d0f9c9f945b162b2b86c05b8b82df0171dbbad225a7e2bfb628c5224b8bd2fb3f91a47b07e0a04856050ca491de5cb1154a26b371"

RPROVIDES:${PN} += "libvsmbr-tools libvsmbr-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libvsmbr.so.1()(64bit) libvsmbr.so.1(V_20210509)(64bit)"

inherit rpm
