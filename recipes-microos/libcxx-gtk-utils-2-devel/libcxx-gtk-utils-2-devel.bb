SUMMARY = "Lightweight library for GTK+ programs using C++ -- Development Files"
DESCRIPTION = "This is a lightweight library containing a number of classes and \
functions for programming GTK+ programs using C++ in POSIX (unix-like) \
environments, where the user does not want to use a full-on wrapper \
such as gtkmm or wxWidgets."
LICENSE = "LGPL-2.1-only"

PV = "2.2.20"

RPM_NAME = "libcxx-gtk-utils-2-devel-2.2.20-1.12.aarch64.rpm"
RPM_HASH = "1760c5095119302fe8b5fe4b0204e7dedae6e3749e81342da98d09104f597abbc2451501dd5e41438041932486db83273967305ce4f440833c68f78f502b6873"

RPROVIDES:${PN} += "libcxx-gtk-utils-2-devel libcxx-gtk-utils-2-devel(aarch-64) pkgconfig(c++-gtk-utils-2-2.2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcxx-gtk-utils-2-2_2-0 pkgconfig(glib-2.0) pkgconfig(gthread-2.0)"

inherit rpm
