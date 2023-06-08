SUMMARY = "Development files for the Glib C++ API"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.0"

RPM_NAME = "glibmm2-devel-2.76.0-1.1.aarch64.rpm"
RPM_HASH = "56da4b29bb3828e67a09eccf46c06652465bff25abaa9b56090493758ce06fe5471842fcfd8d29805fe48ee9327789bc3a63239c6d5e7a6f4639f1fff09db3c1"

RPROVIDES:${PN} += "glibmm2-devel glibmm2-devel(aarch-64) glibmm2-doc perl(DocsParser) perl(Enum) perl(Function) perl(FunctionBase) perl(GtkDefs) perl(GtkDefs::Function) perl(GtkDefs::Signal) perl(Object) perl(Output) perl(Property) perl(Util) perl(WrapParser) pkgconfig(giomm-2.68) pkgconfig(glibmm-2.68)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgiomm-2_68-1 libglibmm-2_68-1 pkgconfig(gio-2.0) pkgconfig(glibmm-2.68) pkgconfig(gobject-2.0) pkgconfig(sigc++-3.0)"

inherit rpm
