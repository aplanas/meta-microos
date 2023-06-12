SUMMARY = "GNU Spread Sheet Widget library for Gtk+"
DESCRIPTION = "GNU Spread Sheet Widget is a library for Gtk+ which provides a widget for \
viewing and manipulating 2-dimensional tabular data in a manner similar to many \
popular spread sheet programs. \
 \
The design follows the model-view-controller paradigm and is of complexity O(1) \
in both time and space. This means that it is efficient and fast even for very \
large data. \
 \
Features commonly found in graphical user interfaces such as cut and paste, \
drag and drop and row/column labelling are also included."
LICENSE = "GPL-3.0-or-later"

PV = "0.8"

RPM_NAME = "libspread-sheet-widget0-0.8-1.10.aarch64.rpm"
RPM_HASH = "e68ce9a92a263439faa2f8942fc0269e7aa0569e661b93f66e4a47c13fc5da46ead7d5e86f3810bf7181ebd6fe679c93c8b47ba472882f51ee2f6e560a1c25fd"

RPROVIDES:${PN} += "libspread-sheet-widget.so.0()(64bit) \
libspread-sheet-widget0 \
libspread-sheet-widget0(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
