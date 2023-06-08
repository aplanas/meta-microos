SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql11-orafce-4.2.6+git0.86d7f4c-1.1.aarch64.rpm"
RPM_HASH = "2293935dfd5bb2a7b998b8077727956ef40b188cf63c57a963b6a818b69977a1a0fb01eb7f764b98d074090c9a6437351540bcc579bc9c517dbc39ec2a23b181"

RPROVIDES:${PN} += "orafce postgresql11-orafce postgresql11-orafce(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) postgresql11-server"

inherit rpm
