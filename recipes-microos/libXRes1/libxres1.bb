SUMMARY = "X Resource extension client library"
DESCRIPTION = "libXRes provides an X Window System client interface to the Resource \
extension to the X protocol. The Resource extension allows for X \
clients to see and monitor the X resource usage of various clients \
(pixmaps, et al)."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "libXRes1-1.2.2-1.2.aarch64.rpm"
RPM_HASH = "8ed516925ad5e8784cad7124ff0b680ffcb555e905b9a514f2ff742159ab88090afd9b030647301a50d12c425a3dbb6cdb0aa8a96e70312f61e0c98b1512ef0d"

RPROVIDES:${PN} += "libXRes.so.1()(64bit) libXRes1 libXRes1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
