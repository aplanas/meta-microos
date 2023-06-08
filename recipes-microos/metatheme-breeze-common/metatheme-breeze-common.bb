SUMMARY = "GTK+ theme matching KDE's Breeze -- Common Files"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.4"

RPM_NAME = "metatheme-breeze-common-5.27.4-2.1.aarch64.rpm"
RPM_HASH = "040869ee47b68d20349ea10e5b5fbe0271fcd17672aea4f8fdbc38db4f5296c14b9339c5c82f7528bb95d06225dd5b7d33d7e06ab1cccb33f494f3debefaf152"

RPROVIDES:${PN} += "breeze-gtk metatheme-breeze-common metatheme-breeze-common(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
