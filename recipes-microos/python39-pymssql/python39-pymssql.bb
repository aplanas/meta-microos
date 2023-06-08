SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.1.5"

RPM_NAME = "python39-pymssql-2.1.5-1.15.aarch64.rpm"
RPM_HASH = "d41bbbf9f8cc0f087baa77895eb7da40cbc76a18e6c9036870d94cd136c9fa0056ffb299114f3c5334657416ddf26af2d3c78921e9964bb38d075b7c78d5f895"

RPROVIDES:${PN} += "python3.9dist(pymssql) python39-pymssql python39-pymssql(aarch-64) python3dist(pymssql)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsybdb.so.5()(64bit) python(abi)"

inherit rpm
