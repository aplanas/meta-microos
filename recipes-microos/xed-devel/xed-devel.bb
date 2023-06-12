SUMMARY = "Development files for Xed, a text editor"
DESCRIPTION = "xed is a text editor designed for the Cinnamon desktop. It has most \
standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, printing and editing of multiple \
documents in one window. \
 \
xed is extensible through a plugin system, which currently \
includes support for spell checking, comparing files, viewing VCS \
ChangeLogs, and adjusting indentation levels."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.8"

RPM_NAME = "xed-devel-3.2.8-1.3.aarch64.rpm"
RPM_HASH = "a133a5db8d72b43f584f683bf5683004cb332a8a707af233c086c9ba7953d825f840f73c3f30d73ad01e732866cfa447444e740827df4fc36731044115930388"

RPROVIDES:${PN} += "pkgconfig(xed) \
xed-devel \
xed-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(gtksourceview-3.0) \
pkgconfig(gtksourceview-4) \
pkgconfig(libpeas-1.0) \
pkgconfig(libpeas-gtk-1.0) \
pkgconfig(libxml-2.0) \
pkgconfig(x11) \
pkgconfig(xapp) \
xed"

inherit rpm
