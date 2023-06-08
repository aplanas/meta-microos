SUMMARY = "Gtk browser for perf-report"
DESCRIPTION = "A GTK2 frontend for perf-report. (Use `perf report --gtk`.)"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "perf-gtk-6.3.1-79.18.aarch64.rpm"
RPM_HASH = "dfd3dfd5cb30fdba9d59fa0f315dfb8ebcb426a8553cdf2253d8ef597f065913b50e3275243c788885ed2bd08b766fab6d5f37e0f8bada477a799c20176cb899"

RPROVIDES:${PN} += "libperf-gtk.so()(64bit) perf-gtk perf-gtk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) perf"

inherit rpm
