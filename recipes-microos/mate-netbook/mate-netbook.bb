SUMMARY = "MATE Desktop window management tool"
DESCRIPTION = "This package provides a simple window management tool which provides the \
following functionality: \
 * Allow to set basic rules for window types; \
 * Allow exceptions to the rules based on string matching for window \
   name and window class; \
 * Allows reversing of rules when the user manually changes something; \
 * Re-decorates windows on un-maximise"
LICENSE = "GPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "mate-netbook-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "762e96ba11427a750f6c8d9b8f493e48bd174cf5b36fa2ab9c6ee031d26dbf64ae88a9cc4ea2baf67b805f9ec6206e7ade0529ed5af6d52d26cdc4de7b5c380a"

RPROVIDES:${PN} += "config(mate-netbook) mate-netbook mate-netbook(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libfakekey.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmate-panel-applet-4.so.1()(64bit) libpango-1.0.so.0()(64bit) libwnck-3.so.0()(64bit) mate-panel"

inherit rpm
