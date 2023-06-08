SUMMARY = "Lightweight library for GTK+ programs using C++ -- Development Files"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-4-devel-2.2.20-1.12.aarch64.rpm"
RPM_HASH = "3d15f606414b6a97709c722188641ea53c9ccce3a1066891d80b6f33f0660860e2c10c2e6e67e3ec666a1f985933bbef060c221a8d700bff29d761c3d0bcdd4f"

RPROVIDES:${PN} += "libcxx-gtk-utils-4-devel libcxx-gtk-utils-4-devel(aarch-64) pkgconfig(c++-gtk-utils-4-2.2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcxx-gtk-utils-4-2_2-0 pkgconfig(glib-2.0) pkgconfig(gthread-2.0)"

inherit rpm
