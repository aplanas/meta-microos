SUMMARY = "Console based ip subnet calculator with IPv4 and IPv6 support"
DESCRIPTION = "Sipcalc is an console based ip subnet calculator with IPv4 and IPv6 support."
LICENSE = "BSD-3-Clause"

PV = "1.1.6"

RPM_NAME = "sipcalc-1.1.6-2.23.aarch64.rpm"
RPM_HASH = "a2b2b7e480a88ebba56d1e1c4a787a51c0babea37efbc7696d8cf147636d00b33562ee5bda37ed11abf5458cbce47042bf1278c7d21fbeff1ed7b6f3fada9a85"

RPROVIDES:${PN} += "sipcalc sipcalc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
