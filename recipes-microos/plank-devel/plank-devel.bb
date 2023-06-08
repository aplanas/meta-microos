SUMMARY = "Development files for the Plank dock"
DESCRIPTION = "The libxnoise development package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking application which will use libplank."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-devel-0.11.89-2.4.aarch64.rpm"
RPM_HASH = "9a8d704a1b8d8610341c1c8b8b644946b0818341b9437ca5b612878fefdc5973dbc60ecb96c63ffe3c859e252660500d83daa0f2c9783faa5f8d05ec45db9181"

RPROVIDES:${PN} += "pkgconfig(plank) plank-devel plank-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libplank1 pkgconfig(cairo) pkgconfig(gdk-3.0) pkgconfig(gdk-pixbuf-2.0) pkgconfig(gee-0.8) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(libbamf3)"

inherit rpm
