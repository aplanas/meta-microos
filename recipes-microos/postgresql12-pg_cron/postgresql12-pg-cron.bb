SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql12-pg_cron-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "01161e8ff2e0ea8183c24323e3fc65348a70e59ab11538a824e79255a4ed722c4330978980c0435d06e7e7f1f7b0343e65c633734cb007826aebed0435ed7af1"

RPROVIDES:${PN} += "postgresql12-pg_cron postgresql12-pg_cron(aarch-64) postgresql12-pg_cron-llvmjit"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) postgresql12-server"

inherit rpm
