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

RPM_NAME = "python311-SQLAlchemy-2.0.12-1.1.aarch64.rpm"
RPM_HASH = "b18b8a413ac9c730e982a57c5f7be2582494b5cb9182c05f972c5b67cb91d8cfb41f175e58a2126049f798c028eba0313661267448e399cacc1c642cb7993246"

RPROVIDES:${PN} += "python3.11dist(sqlalchemy) python311-SQLAlchemy python311-SQLAlchemy(aarch-64) python311-sqlalchemy python3dist(sqlalchemy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311 python311-greenlet"

inherit rpm
