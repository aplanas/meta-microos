SUMMARY = "Glade catalog for libgda"
DESCRIPTION = "This package provides a catalog for Glade, to allow the use the libgda \
widgets in Glade."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "glade-catalog-libgda-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "5c3fab1a583046a57c6597b62805b3959e90124b3bdebf32eea0d3b488b01f974d6e2d2aa97dba6d8badae7652626ffbfac90258435d8101e3b06cd87e6edc83"

RPROVIDES:${PN} += "glade-catalog-libgda glade-catalog-libgda(aarch-64)"
RDEPENDS:${PN} += "glade libgda-6_0"

inherit rpm
