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

PV = "1.3.4"

RPM_NAME = "postgresql11-pgaudit-1.3.4-4.1.aarch64.rpm"
RPM_HASH = "a614f6cd81d919bd13a84b15af6e09ea7382a0bd474bd6f6684aee27eb989d3550fc4b7ac6a40ec9471e9d64245b02051beafee6370709895b4d4ebef253f004"

RPROVIDES:${PN} += "postgresql11-pgaudit postgresql11-pgaudit(aarch-64) postgresql11-pgaudit-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) postgresql11-server"

inherit rpm
