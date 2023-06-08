SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "2.0.12"

RPM_NAME = "python39-SQLAlchemy-2.0.12-1.1.aarch64.rpm"
RPM_HASH = "0dbe2ef1b98cba41a91a2a9897563450bf2ca04dcb1e814a42d3712a29f3a30ad3e9c2b2ac127995f76a034efcce5e95529da50c09f588ace8de4c024dee223c"

RPROVIDES:${PN} += "python3.9dist(sqlalchemy) python39-SQLAlchemy python39-SQLAlchemy(aarch-64) python39-sqlalchemy python3dist(sqlalchemy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39 python39-greenlet"

inherit rpm
