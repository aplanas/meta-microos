SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python310-SQLAlchemy-2.0.15-1.1.aarch64.rpm"
RPM_HASH = "30dfba8f5ac1fdbb7910aa259e7856c025f4edad33f09372dac3a4b1ada8aeb51b9728c2c416cf102831efede88ffaad22fccf137a52ef7c54bd3370fd3ee4c9"

RPROVIDES:${PN} += "python3-SQLAlchemy python3-sqlalchemy python3.10dist(sqlalchemy) python310-SQLAlchemy python310-SQLAlchemy(aarch-64) python310-sqlalchemy python3dist(sqlalchemy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310 python310-greenlet python310-typing_extensions"

inherit rpm
