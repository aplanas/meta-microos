SUMMARY = "Glade catalog for Anjuta"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop. \
 \
This package provides a catalog for Glade, to allow the use the Anjuta \
widgets in Glade."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "glade-catalog-anjuta-3.34.0-5.6.aarch64.rpm"
RPM_HASH = "da727d7d2e279f6e46d657a1be24414c2099eff10363c3f7ecd1a32b4d2973bd54dd14ada50e467c015f01d6cb8187353de300dc358b714b108f79943090b528"

RPROVIDES:${PN} += "glade-catalog-anjuta glade-catalog-anjuta(aarch-64) libgladeanjuta.so()(64bit)"
RDEPENDS:${PN} += "anjuta glade"

inherit rpm
