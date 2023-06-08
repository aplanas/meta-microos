SUMMARY = "User-mode driver and GTK3-based GUI for the Steam Controller"
DESCRIPTION = "Application allowing to setup, configure and use the Steam Controller \
without using the Steam client."
LICENSE = "GPL-2.0-only"

PV = "0.4.8.8"

RPM_NAME = "sc-controller-0.4.8.8-1.3.aarch64.rpm"
RPM_HASH = "b660ff703fa82a306681ed4a81d1a24ef6cb203030074872ce3fce59b450c479926e8c57a75458caf9e169b5dcb1b96892fa6977d5af5626f55433be53ed5db7"

RPROVIDES:${PN} += "application() application(sc-controller.desktop) libcemuhook.cpython-310-aarch64-linux-gnu.so()(64bit) libhiddrv.cpython-310-aarch64-linux-gnu.so()(64bit) libremotepad.cpython-310-aarch64-linux-gnu.so()(64bit) libsc_by_bt.cpython-310-aarch64-linux-gnu.so()(64bit) libuinput.cpython-310-aarch64-linux-gnu.so()(64bit) mimehandler(application/x-scc-profile) mimehandler(application/x-scc-profile-package) mimehandler(application/x-steamcontrollerdb-profile) python3.10dist(sccontroller) python3dist(sccontroller) sc-controller sc-controller(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libz.so.1()(64bit) python(abi) python3-evdev python3-gobject-Gdk python3-pycairo python3-pylibacl python3-setuptools typelib(AppIndicator3) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(GdkX11) typelib(Gio) typelib(Gtk) typelib(GtkLayerShell) typelib(Pango) typelib(Rsvg) typelib(cairo)"

inherit rpm
