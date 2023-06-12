SUMMARY = "Python asyncio PosgtreSQL driver"
DESCRIPTION = "A fast PostgreSQL Database Client Library for Python/asyncio. \
 \
**asyncpg** is a database interface library designed specifically for \
PostgreSQL and Python/asyncio with clean implementation"
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "python311-asyncpg-0.27.0-1.6.aarch64.rpm"
RPM_HASH = "15867d0bb35d44f168bb45c3714fcc9891d230253836c0d264e02c3ce2497daf06b5f18d32707f555ff6f3be5a579f69b185c5ab660bb843773b9a1d7a6bb647"

RPROVIDES:${PN} += "python3.11dist(asyncpg) \
python311-asyncpg \
python311-asyncpg(aarch-64) \
python3dist(asyncpg)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq5 \
python(abi)"

inherit rpm
