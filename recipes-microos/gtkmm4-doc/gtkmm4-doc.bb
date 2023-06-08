SUMMARY = "C++ Interface for GTK4 (a GUI Library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkmm4-doc-4.10.0-1.1.noarch.rpm"
RPM_HASH = "971b113b5e428edafefd448e32dde15ae675a020a3b6100e594480482737ef8bd00fd019659ae812651e1fb96b31c14536e91e4267dcb0e248dd1babfa8d19af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm4-doc"
RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
