SUMMARY = "C++ Bindings for GTK+ -- Tutorial"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm wraps \
GTK+. Highlights include typesafe callbacks, widgets extensible via \
inheritance, and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "2.24.1"

RPM_NAME = "gtkmm2-tutorial-2.24.1-16.10.noarch.rpm"
RPM_HASH = "2dbe87f1dc40c4010e44e609cb17c79ff6754eedf4e84d12e56f66680dfdd5e895b39de01e2b5ac9609766b49cfea009d8c06679615d5b230c5173a4fcbead4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkmm2-documentation \
gtkmm2-tutorial"
RDEPENDS:${PN} += "gtkmm2-doc"

inherit rpm
