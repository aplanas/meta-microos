SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql14-orafce-4.2.6+git0.86d7f4c-1.1.aarch64.rpm"
RPM_HASH = "a2b1a554fdff4c0ac0eb836bc01cee41d143d5ccfde56f2695a106110f7b448676da908ffe87c8b60dc35a4c0b3dc4a1014634b59b954577ba83db3c33b14c1c"

RPROVIDES:${PN} += "orafce postgresql14-orafce postgresql14-orafce(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) postgresql14-server"

inherit rpm
