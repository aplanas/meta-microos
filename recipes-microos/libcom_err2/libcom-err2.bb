SUMMARY = "E2fsprogs error reporting library"
DESCRIPTION = "com_err is an error message display library."
LICENSE = "MIT"

PV = "1.46.5"

RPM_NAME = "libcom_err2-1.46.5-4.3.aarch64.rpm"
RPM_HASH = "6bb6462eedef4ca14ca45375fe839b3be896845c2167221457c06fdfd957a3a48eec32cffd740306ecbf51342a860782fe5a12a09f2e29cc6b59024dc9e37457"

RPROVIDES:${PN} += "libcom_err libcom_err.so.2()(64bit) libcom_err2 libcom_err2(aarch-64) libss.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
