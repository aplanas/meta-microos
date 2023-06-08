SUMMARY = "The main library for AppStream"
DESCRIPTION = "The main library for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "libappstream4-0.16.1-2.3.aarch64.rpm"
RPM_HASH = "42b715b387b9a731f0be0088c9a34d404d8a1194a0aec9bda544fd7e5421f8b5eeface69180df131c3229a1a22336f3fee88cac2242569c9a830750ea6ca0583"

RPROVIDES:${PN} += "libappstream.so.4()(64bit) libappstream4 libappstream4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcurl.so.4()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_240)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) libxmlb.so.2()(64bit) libxmlb.so.2(LIBXMLB_0.1.0)(64bit) libxmlb.so.2(LIBXMLB_0.1.1)(64bit) libxmlb.so.2(LIBXMLB_0.1.12)(64bit) libxmlb.so.2(LIBXMLB_0.1.4)(64bit) libxmlb.so.2(LIBXMLB_0.3.0)(64bit) libxmlb.so.2(LIBXMLB_0.3.1)(64bit) libxmlb.so.2(LIBXMLB_0.3.4)(64bit) libyaml-0.so.2()(64bit)"

inherit rpm
