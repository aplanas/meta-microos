SUMMARY = "GTK+ binding for librep Lisp environment - Development Files"
DESCRIPTION = "This is a binding of GTK+ for the rep Lisp system. It is based on \
Marius Vollmer's guile-gtk binding (initially version 0.15, updated to \
0.17), with a new glue-code generator."
LICENSE = "GPL-2.0+"

PV = "0.90.8.2"

RPM_NAME = "rep-gtk-devel-0.90.8.2-1.30.aarch64.rpm"
RPM_HASH = "d7f8da87fac4d77ae97582977f38843d470506906852bf762c37c97960be487b30fbcac190781781b4c10ca20dd9d1831e5e8ae0410d8cfc32094cf40b993ef8"

RPROVIDES:${PN} += "pkgconfig(rep-gtk) \
rep-gtk-devel \
rep-gtk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gtk+-2.0) \
pkgconfig(librep) \
rep-gtk"

inherit rpm
