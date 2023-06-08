SUMMARY = "Libyui header files and examples"
DESCRIPTION = " \
This package contains header files and examples for developing C++ \
applications based on libyui, the user interface engine that provides \
the abstraction from graphical user interfaces (Qt, Gtk) and text \
based user interfaces (ncurses)."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "0c76fec28b5d0e46d40afe8a2b89054d8a97b76248a30abe8ff1f5e8a33a7c119d4088ae4b0016dd962bef400982b223733a7a0cb8e85aab9e57f9888aabe172"

RPROVIDES:${PN} += "libyui-devel libyui-devel(aarch-64) pkgconfig(libyui)"
RDEPENDS:${PN} += "/usr/bin/pkg-config boost-devel glibc-devel libstdc++-devel libyui16"

inherit rpm
