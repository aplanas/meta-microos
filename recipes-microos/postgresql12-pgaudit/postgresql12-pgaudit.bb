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

PV = "1.4.3"

RPM_NAME = "postgresql12-pgaudit-1.4.3-4.2.aarch64.rpm"
RPM_HASH = "77c845627f24b8f0c0fe51d8d99385ae4e95eb48d0f2f5679a8d6a7190c6dcd75207e63eeaeaf5f3783072a2aaced4274fcd071934f05de4e208f20960edd50f"

RPROVIDES:${PN} += "postgresql12-pgaudit \
postgresql12-pgaudit(aarch-64) \
postgresql12-pgaudit-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
postgresql12-server"

inherit rpm
