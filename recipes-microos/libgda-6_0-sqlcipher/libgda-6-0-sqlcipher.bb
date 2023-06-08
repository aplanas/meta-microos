SUMMARY = "SQLCipher Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlcipher-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "edef6683b0d62676028cc0583bf2dca5baabb44242e74648f85eebe3516fec835bf01e20632369d807b7bc99ea318ba30a0135081968b34dea8c26d7b7389bb7"

RPROVIDES:${PN} += "libgda-6_0-sqlcipher libgda-6_0-sqlcipher(aarch-64) libgda-sqlcipher libgda-sqlcipher-6.0.so()(64bit)"
RDEPENDS:${PN} += "libgda-6.0.so.6.0.0()(64bit) libgda-6_0-6_0_0 libgda-6_0-sqlite libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsqlcipher-3.39.4.so.0()(64bit)"

inherit rpm
