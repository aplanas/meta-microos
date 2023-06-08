SUMMARY = "DCE compatible Universally Unique Identifier library for Perl"
DESCRIPTION = "The UUID library is used to generate unique identifiers for objects that \
may be accessible beyond the local system. For instance, they could be used \
to generate unique HTTP cookies across multiple web servers without \
communication between the servers, and without fear of a name clash. \
 \
The generated UUIDs can be reasonably expected to be unique within a \
system, and unique across all systems, and are compatible with those \
created by the Open Software Foundation (OSF) Distributed Computing \
Environment (DCE) utility uuidgen."
LICENSE = "Artistic-2.0"

PV = "0.28"

RPM_NAME = "perl-UUID-0.28-1.13.aarch64.rpm"
RPM_HASH = "0a6865f03d740c0532cf84389f009a097028354ed39de633b0203dc00498ae320cbd9032ee0f0b780657db3cffcd79fe0ad1488d5e9eb57caa0c9ea597286790"

RPROVIDES:${PN} += "perl(UUID) perl-UUID perl-UUID(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
