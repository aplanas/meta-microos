SUMMARY = "Platform Independent Hotkey Handling for GTK+ Applications -- Development Files"
DESCRIPTION = "GtkHotkey is simple library offering a platform independent way for GTK+ \
applications to manage and bind desktop-wide hotkeys.  This package contains \
all necessary include files and libraries needed to develop applications that \
require these."
LICENSE = "LGPL-3.0+"

PV = "0.2.1"

RPM_NAME = "libgtkhotkey-devel-0.2.1-16.27.aarch64.rpm"
RPM_HASH = "4cbaebdbf35d796920e7fd7ee531e2a4a8e537eb1dae1dda608667a18d1cb0f8e107b3fd1e4852183af739cedb5d52b94035fdb196e1da79bab713e23055b938"

RPROVIDES:${PN} += "libgtkhotkey-devel \
libgtkhotkey-devel(aarch-64) \
pkgconfig(gtkhotkey-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
gtk2-devel \
libgtkhotkey1 \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-2.0)"

inherit rpm
