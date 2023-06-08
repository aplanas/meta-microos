SUMMARY = "A simple database interface to MS-SQL for Python"
DESCRIPTION = "pymssql is the Python language extension module that provides access to \
Microsoft SQL Servers from Python scripts. It is compliant with Python \
DB-API 2.0 Specification and works on most popular operating systems."
LICENSE = "LGPL-2.1-only"

PV = "2.1.5"

RPM_NAME = "python311-pymssql-2.1.5-1.15.aarch64.rpm"
RPM_HASH = "64b79d9f50b9f9c06f8b50dae731e49e5b593bfaf2fd9411040d09c74a7410ec3eb10df7f9febd95366c538932b6bc62ebcf3b2490db4d7f97798e165406e012"

RPROVIDES:${PN} += "python3.11dist(pymssql) python311-pymssql python311-pymssql(aarch-64) python3dist(pymssql)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsybdb.so.5()(64bit) python(abi)"

inherit rpm
