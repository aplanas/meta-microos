SUMMARY = "Application to manage personal accounts"
DESCRIPTION = "HomeBank is an application to manage personal accounts at home. The main \
concept is to be light, simple and very easy to use. It brings many \
features that allows to analyze finances in a detailed way instantly and \
dynamically with powerful report tools based on filtering and graphical \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.3"

RPM_NAME = "homebank-5.6.3-1.2.aarch64.rpm"
RPM_HASH = "043915ae138a330ff3295d2d12d2779240ed19d0a12535bb62b68e25de182f92aeaa167de193f3e5572793c1a4fd45c437733686c17d28ad88100ebe087ab26b"

RPROVIDES:${PN} += "application() application(homebank.desktop) homebank homebank(aarch-64) metainfo() metainfo(homebank.appdata.xml) mimehandler(application/x-homebank)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libofx.so.7()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libsoup-2.4.so.1()(64bit)"

inherit rpm
