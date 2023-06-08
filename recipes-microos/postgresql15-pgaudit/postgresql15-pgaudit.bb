SUMMARY = "An auditing module for PostgreSQL"
DESCRIPTION = "This is the initial version of an auditing module for Postgres. \
 \
It collects audit events from various sources and logs them in CSV format \
including a timestamp, user information, details of objects affected (if any), \
and the fully-qualified command text (whenever available). \
 \
All DDL, DML (including SELECT), and utility commands are supported. These \
are categorised as described below, and audit logging for each group of \
commands may be enabled or disabled by the superuser. Once enabled, however, \
audit logging may not be disabled by a user."
LICENSE = "PostgreSQL"

PV = "1.7.0"

RPM_NAME = "postgresql15-pgaudit-1.7.0-4.1.aarch64.rpm"
RPM_HASH = "8a74249fe79189ddfa2994cb3c0c40e00b394d418ae96278f0874059da8bcbd0d2ea0529ec8f62783190e7704223409a43d0d355358e7bbc78b1c378e0ac1871"

RPROVIDES:${PN} += "postgresql15-pgaudit postgresql15-pgaudit(aarch-64) postgresql15-pgaudit-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) postgresql15-server"

inherit rpm
