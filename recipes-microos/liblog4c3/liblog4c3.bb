SUMMARY = "A library of C for flexible logging to files, syslog and other destinations"
DESCRIPTION = "Log4c is a library of C for flexible logging to files, syslog and other \
destinations. It is modeled after the Log for Java library \
(http://jakarta.apache.org/log4j/), staying as close to their API as is \
reasonable."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c3-1.2.4-5.26.aarch64.rpm"
RPM_HASH = "ff62bede66bbee815473ed5614fe9a8af6265b292a64abe2949b317516a2bd7c377d32679b90856cce694d2276413972f750d602b1d9b8de00c003ac99b96274"

RPROVIDES:${PN} += "liblog4c.so.3()(64bit) \
liblog4c3 \
liblog4c3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libexpat.so.1()(64bit)"

inherit rpm
