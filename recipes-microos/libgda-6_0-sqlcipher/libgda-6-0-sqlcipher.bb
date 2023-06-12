SUMMARY = "SQLCipher Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlcipher-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "d7f1558271a4e1f950129ce0fb83633fe9309e018885ec48ce6ddb5e30361d0432095c7eefc5fa5e9d70f1795fcf0b43913644241482ecefb37fc47ac845d0dc"

RPROVIDES:${PN} += "libgda-6_0-sqlcipher libgda-6_0-sqlcipher(aarch-64) libgda-sqlcipher libgda-sqlcipher-6.0.so()(64bit)"
RDEPENDS:${PN} += "libgda-6.0.so.6.0.0()(64bit) libgda-6_0-6_0_0 libgda-6_0-sqlite libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsqlcipher-3.41.2.so.0()(64bit)"

inherit rpm
