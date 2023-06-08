SUMMARY = "UDP Socket Extension for Tcl"
DESCRIPTION = "This package makes the UDP protocol available for Tcl interpreters. It \
allows access to message-oriented UDP through stream-oriented Tcl \
channels."
LICENSE = "BSD-3-Clause"

PV = "1.0.11"

RPM_NAME = "tcludp-1.0.11-1.26.aarch64.rpm"
RPM_HASH = "7555a2c2484bf4d3966451c6b06138a4701102d0024961b5067935c163cff52f914a7a1506eac41ace15a8c873c83b5b0b4ea2e9814d4ce8505d064f90fd3374"

RPROVIDES:${PN} += "libudp1.0.11.so()(64bit) tcludp tcludp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
