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

RPM_NAME = "python310-SQLAlchemy-2.0.12-1.1.aarch64.rpm"
RPM_HASH = "072779555f854c97bad5fe80ddcbf480144e83afe53d395e5849ae0b68b0ee3f023a86926a66c7bae24ffa75e5347818c60829f97a34a26c25dbffccca1371c3"

RPROVIDES:${PN} += "python3-SQLAlchemy python3-sqlalchemy python3.10dist(sqlalchemy) python310-SQLAlchemy python310-SQLAlchemy(aarch-64) python310-sqlalchemy python3dist(sqlalchemy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310 python310-greenlet"

inherit rpm
