SUMMARY = "C++ Interface for GTK3 (a GUI Library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.24.7"

RPM_NAME = "gtkmm3-doc-3.24.7-2.3.noarch.rpm"
RPM_HASH = "0dbde4039e4b2ea941d0efca70cd489e0d92ad3d7019749c02ec44e9f13c202557fb180e7a7babf139b481bef56803df21e82674c4c13340129cda5b259365fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm3-doc"
RDEPENDS:${PN} += "glibmm2-doc"

inherit rpm
