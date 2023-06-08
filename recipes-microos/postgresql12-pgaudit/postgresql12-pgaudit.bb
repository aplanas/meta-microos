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

RPM_NAME = "postgresql12-pgaudit-1.4.3-4.1.aarch64.rpm"
RPM_HASH = "bd3446b98d7f8be3fc82c3c1034dc8b520187a13c1b3357c388b024151ae8eeadf38a4483318ea35fa055ff8a302472cd4ea4c67ba7c6ee888e3e55a349a0958"

RPROVIDES:${PN} += "postgresql12-pgaudit postgresql12-pgaudit(aarch-64) postgresql12-pgaudit-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) postgresql12-server"

inherit rpm
