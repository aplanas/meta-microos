SUMMARY = "Library implementing GTP between SGSN and GGSN"
DESCRIPTION = "libgtp implements the GPRS Tunneling Protocol between SGSN and GGSN."
LICENSE = "GPL-2.0-only"

PV = "1.9.0"

RPM_NAME = "libgtp6-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "d771daa917bb9da918422593131bbffa0d97d5ca5b38f9cedc81b50b1af0f849f6f7561bf738ce6013f4cd820e74965f424705f4624b6c6eff9a87f085b03506"

RPROVIDES:${PN} += "libgtp.so.6()(64bit) libgtp6 libgtp6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
