SUMMARY = "Glade catalog for Anjuta"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop. \
 \
This package provides a catalog for Glade, to allow the use the Anjuta \
widgets in Glade."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "glade-catalog-anjuta-3.34.0-5.7.aarch64.rpm"
RPM_HASH = "9a2335e8feed2e8af84fcbba1d6816dac4e2d9daf6b5bc1c20915176106dc5344edc92ffba193a25b815e8ade77875975b57e492162f0ed8dae8042ed85a0389"

RPROVIDES:${PN} += "glade-catalog-anjuta glade-catalog-anjuta(aarch-64) libgladeanjuta.so()(64bit)"
RDEPENDS:${PN} += "anjuta glade"

inherit rpm
