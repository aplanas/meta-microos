SUMMARY = "Open Virtual Network core libraries"
DESCRIPTION = "This subpackage contains the OVN shared libraries."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "libovn-23_03-0-23.03.0-13.1.aarch64.rpm"
RPM_HASH = "5fd029b50afbdb6d010b642406b2d254e9981591bbef36c9b9ae2c989ff98b18d8af250d4246352b3ed2bbd829a52b279100a04ab3c042f71070878f79ab7ac4"

RPROVIDES:${PN} += "libovn-23.03.so.0()(64bit) libovn-23.03.so.0(libovn_0)(64bit) libovn-23_03-0 libovn-23_03-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libopenvswitch-3.1.so.0()(64bit) libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit)"

inherit rpm
