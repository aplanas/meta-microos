SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "1.4.46"

RPM_NAME = "python310-SQLAlchemy1-1.4.46-2.1.aarch64.rpm"
RPM_HASH = "e3abe172ada39bc3d30fabdbec815febbba66e919cf59d9f55a44409b99e6e0f2af3c17501f2041a55be29c95c09d6646ccd92142481b8ad970f4187b0527a95"

RPROVIDES:${PN} += "python3-SQLAlchemy1 python3-sqlalchemy python3.10dist(sqlalchemy) python310-SQLAlchemy1 python310-SQLAlchemy1(aarch-64) python310-sqlalchemy python3dist(sqlalchemy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310 python310-greenlet"

inherit rpm
