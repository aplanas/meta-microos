SUMMARY = "Open Database Connectivity API"
DESCRIPTION = "ODBC is an API that abstracts the access to different database \
management systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "libodbc2-2.3.11-2.4.aarch64.rpm"
RPM_HASH = "60788eca0e435f65a5116c70095ea4ca42c9c6236071f93d950d887d63de12896620b7be86a973b29839c3f70c906ac877963396345bcc92b62a8bc93503ee51"

RPROVIDES:${PN} += "libodbc.so.2()(64bit) \
libodbc2 \
libodbc2(aarch-64) \
libodbccr.so.2()(64bit) \
libodbcinst.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libltdl.so.7()(64bit)"

inherit rpm
