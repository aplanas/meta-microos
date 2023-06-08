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

PV = "1.5.2"

RPM_NAME = "postgresql13-pgaudit-1.5.2-4.1.aarch64.rpm"
RPM_HASH = "3180f0e2dd31b0236d5d77109facf70e9d5a06c82a35261d871d1d0d8cc84d942ec6ad4a34b81d1ba91c0b7b4fa29fef9aaf5bf4c8c8abfd4603202980cccdab"

RPROVIDES:${PN} += "postgresql13-pgaudit postgresql13-pgaudit(aarch-64) postgresql13-pgaudit-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) postgresql13-server"

inherit rpm
