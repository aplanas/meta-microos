SUMMARY = "PostgreSQL module for simple job schedule"
DESCRIPTION = "pg_cron is a simple cron-based job scheduler for PostgreSQL (9.5 or higher) \
that runs inside the database as an extension. It uses the same syntax as \
regular cron, but it allows you to schedule PostgreSQL commands directly from \
the database."
LICENSE = "PostgreSQL"

PV = "1.5.2"

RPM_NAME = "postgresql15-pg_cron-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "171493d3d0d023b34ced7ea779a91d03edbd6ede86ca0eb8dddf7a0b778da250e3773186fde5b67da3f6e1f40a5d6ee06b4961fe38c3540ad4c4e322de5446d4"

RPROVIDES:${PN} += "postgresql15-pg_cron postgresql15-pg_cron(aarch-64) postgresql15-pg_cron-llvmjit"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) postgresql15-server"

inherit rpm
