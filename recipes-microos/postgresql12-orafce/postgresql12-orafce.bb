SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql12-orafce-4.2.6+git0.86d7f4c-1.1.aarch64.rpm"
RPM_HASH = "ab2beb7d36bd87f606ae2e5faa0768ae721c3569445e6421a4ff9a15712f8c2a9f27460df5b4be7e3c92199b13a954d927aedbf8031b5b1b70482498bb52d446"

RPROVIDES:${PN} += "orafce postgresql12-orafce postgresql12-orafce(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) postgresql12-server"

inherit rpm
