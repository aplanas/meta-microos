SUMMARY = "Libyui header files and examples"
DESCRIPTION = " \
This package contains header files and examples for developing C++ \
applications based on libyui, the user interface engine that provides \
the abstraction from graphical user interfaces (Qt, Gtk) and text \
based user interfaces (ncurses)."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "d40eb07187bb6f0983e75b2df41113bf79ccfe425a4b266e6f3fba765a30364407bb0f75ee425c61b9ff90be000d35f64e0164513dd8f909d4eab4746db2ee8a"

RPROVIDES:${PN} += "libyui-devel libyui-devel(aarch-64) pkgconfig(libyui)"
RDEPENDS:${PN} += "/usr/bin/pkg-config boost-devel glibc-devel libstdc++-devel libyui16"

inherit rpm
