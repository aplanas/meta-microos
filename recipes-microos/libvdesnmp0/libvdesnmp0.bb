SUMMARY = "VDE snmp library"
DESCRIPTION = "This package contains VDE snmp library \
SNMP library for Virtual Distributed Ethernet"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdesnmp0-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "f9a59732403a1255cf58adc63bebadab54c1f7397de0ebfe83dcd052a3943309372c041f15a609a4eede06b66cd135ed44d8de6e38cafa305a4b0612f8dc57bb"

RPROVIDES:${PN} += "libvdesnmp.so.0()(64bit) \
libvdesnmp0 \
libvdesnmp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libvdemgmt.so.0()(64bit)"

inherit rpm
