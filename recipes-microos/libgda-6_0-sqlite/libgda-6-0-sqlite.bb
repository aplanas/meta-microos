SUMMARY = "Sqlite Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlite-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "b5b4d2b3c9af82b3dc70cf905ac7e490e8fe25903fc49d3c2829e0488cb23e54f83529c0c2680a44b59a92888b485419895a986e7b59ca08f7da04b5b7f104d1"

RPROVIDES:${PN} += "libgda-6_0-sqlite libgda-6_0-sqlite(aarch-64) libgda-sqlite libgda-sqlite-6.0.so()(64bit)"
RDEPENDS:${PN} += "libgda-6.0.so.6.0.0()(64bit) libgda-6_0-6_0_0 libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
