SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql15-orafce-4.2.6+git0.86d7f4c-1.1.aarch64.rpm"
RPM_HASH = "5e15f4a018a67891d6ba15ebd13bda6350bf93cc33068aaeee773422b890f65d88154fc2a026484f9641b9d5306ee0c519ad5708960c620e972570ac34d9a9dc"

RPROVIDES:${PN} += "orafce postgresql15-orafce postgresql15-orafce(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) postgresql15-server"

inherit rpm
