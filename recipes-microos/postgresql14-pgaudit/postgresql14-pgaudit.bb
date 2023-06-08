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

PV = "1.6.2"

RPM_NAME = "postgresql14-pgaudit-1.6.2-4.1.aarch64.rpm"
RPM_HASH = "e731c06270c04174411a8723a8b1e276ed12fc7807f0f132bfbea5bb4653a8d35d40931c7194568e01074cc347a223a6074cfb6117ef8c638d1469dacca14c5f"

RPROVIDES:${PN} += "postgresql14-pgaudit postgresql14-pgaudit(aarch-64) postgresql14-pgaudit-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) postgresql14-server"

inherit rpm
