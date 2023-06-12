SUMMARY = "GTK bindings for liblarch"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents) \
 \
This package provides GTK bindings for liblarch."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python310-liblarch-gtk-3.0-2.15.noarch.rpm"
RPM_HASH = "3bc6c4e7d13ab222d0884af1f0f8b678165bfe4ce8bce4b2384591e043ab181e468b4da3446f77c36d1b3c07286c3f59d7b79fb5f89e96cf077c08caecde2857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-liblarch-gtk \
python310-liblarch-gtk"
RDEPENDS:${PN} += "python(abi) \
python310-gobject \
python310-liblarch \
typelib(Gtk)"

inherit rpm
