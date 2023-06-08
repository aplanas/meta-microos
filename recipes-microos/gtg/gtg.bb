SUMMARY = "Personal Organizer for GNOME"
DESCRIPTION = "Getting Things GNOME! (GTG) is a personal organizer for the GNOME desktop \
environment inspired by the Getting Things Done (GTD) methodology. GTG is \
designed with flexibility, adaptability, and ease of use in mind so it can be \
used as more than just GTD software. \
 \
GTG is intended to help you track everything you need to do and need to know, \
from small tasks to large projects."
LICENSE = "GPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "gtg-0.6-1.4.noarch.rpm"
RPM_HASH = "793cb0c130e6345b17dbd022061883d81b19adfbb37216de5c313000246a794936720e70091b40919475aa7df1e4705d0877fc817bfe0c0825e201547eef9699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(org.gnome.GTG.desktop) gtg metainfo() metainfo(org.gnome.GTG.appdata.xml) mimehandler(x-scheme-handler/gtg)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-gobject-Gdk python3-liblarch python3-liblarch-gtk python3-lxml python3-pycairo"

inherit rpm
