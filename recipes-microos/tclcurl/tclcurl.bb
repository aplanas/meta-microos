SUMMARY = "Tcl Binding to libcurl"
DESCRIPTION = "TclCurl provides TCL bindings to the libcurl client-side URL transfer library."
LICENSE = "TCL"

PV = "7.22.0"

RPM_NAME = "tclcurl-7.22.0-9.25.aarch64.rpm"
RPM_HASH = "3ee000d9313f17c82c54ced1127319f6b972c68774661757c57cdb7147eb7fd111a0cdedd951f13f1f292757d0b17325f66a65b563a55a8beff2fb3f00ff953f"

RPROVIDES:${PN} += "libTclCurl7.22.0.so()(64bit) \
tclcurl \
tclcurl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl.so.4()(64bit) \
tcl"

inherit rpm
