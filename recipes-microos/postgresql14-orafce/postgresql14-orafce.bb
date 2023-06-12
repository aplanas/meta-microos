SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql14-orafce-4.2.6+git0.86d7f4c-1.2.aarch64.rpm"
RPM_HASH = "13da87beb4ee005b08c3404c37aed9dfe1b827a6e0d1ab47e0738a126ea6e68ea192b9a49aef78da1ff0ec3237bc330e7ceae5c8974771b61c009bf42c397019"

RPROVIDES:${PN} += "orafce \
postgresql14-orafce \
postgresql14-orafce(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
postgresql14-server"

inherit rpm
