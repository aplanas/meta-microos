SUMMARY = "MATE Desktop calculator application"
DESCRIPTION = "mate-calc is a calculator application that was part of the \
OpenWindows Deskset of the Solaris 8 operating system. \
It incorporates multiple precision arithmetic packages based on the \
work of Professor Richard Brent."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-calc-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "64350f7a0e8ac979323dea79003958fbbd7a0cd406aa66e31d1dbfd65240b2ae76aeece2af9c16c512cdaaf0eb67370cbab9020900d5bb88c70746e7805456ad"

RPROVIDES:${PN} += "application() application(mate-calc.desktop) mate-calc mate-calc(aarch-64) metainfo() metainfo(mate-calc.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libpango-1.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
