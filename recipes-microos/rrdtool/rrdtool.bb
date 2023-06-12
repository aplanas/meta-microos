SUMMARY = "Round Robin Database Tool to store and display time-series data"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). It stores the data in a compact way that will not \
expand over time, and it presents useful graphs by processing the data to \
enforce a certain data density. It can be used either via simple wrapper \
scripts (from shell or Perl) or via frontends that poll network devices and \
put a friendly user interface on it."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "779fa40123dc506e8add6ae6ed42a87fbf08d7749f9935d905b033c72b9503695cf756556f773d858089c559033903fb142ae4e6281cc59a64cc465eda5c0832"

RPROVIDES:${PN} += "rrdtool \
rrdtool(aarch-64)"
RDEPENDS:${PN} += "dejavu \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librrd.so.8()(64bit)"

inherit rpm
