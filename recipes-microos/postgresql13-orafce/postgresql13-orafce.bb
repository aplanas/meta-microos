SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.2.6+git0.86d7f4c"

RPM_NAME = "postgresql13-orafce-4.2.6+git0.86d7f4c-1.1.aarch64.rpm"
RPM_HASH = "a58e6a2c23c2fa5b4a8e9de7fecc3e86aedb8c8f0bfc0aa120401cf8d6c5d98f57714676640a4671cba35f4a26a3736f40b51bd7ab51d2859cdcde2fa9c74e49"

RPROVIDES:${PN} += "orafce postgresql13-orafce postgresql13-orafce(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) postgresql13-server"

inherit rpm
