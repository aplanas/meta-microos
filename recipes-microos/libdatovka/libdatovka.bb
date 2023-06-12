SUMMARY = "Library for accessing the Czech Data Boxes"
DESCRIPTION = "This is a library for accessing ISDS (Informační systém datových schránek / \
Data Box Information System) SOAP services as defined in Czech ISDS Act \
(300/2008 Coll.) and implied documents."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "libdatovka-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "03e1687408288356b72db925612f748e07baa30f8cb1f793c0bf026eda93193b7c613cff6a996521be8ce0ba325edddc565c0b9494fdf7b71d11b4a30b615313"

RPROVIDES:${PN} += "libdatovka \
libdatovka(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
