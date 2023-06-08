SUMMARY = "GTK+ widget for fast data display"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-2 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1+"

PV = "0.9.3.1"

RPM_NAME = "libgtkdatabox-0_9_3-1-0.9.3.1-1.9.aarch64.rpm"
RPM_HASH = "8119eaa836267b65bcff12af12858513a85f73899870fed20f08909738608370a4ed143d1b984c479986ed4fff210d34308c83a4d84e633c595409e6bde1fe1e"

RPROVIDES:${PN} += "libgtkdatabox libgtkdatabox-0.9.3.so.1()(64bit) libgtkdatabox-0_9_3-1 libgtkdatabox-0_9_3-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
