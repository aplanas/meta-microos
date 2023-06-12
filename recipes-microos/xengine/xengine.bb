SUMMARY = "Reciprocating engine for X"
DESCRIPTION = "Xengine displays a reciprocating engine in a window and is a benchmark \
for X."
LICENSE = "ISC"

PV = "1.11"

RPM_NAME = "xengine-1.11-1117.25.aarch64.rpm"
RPM_HASH = "b7798ecfa71974b4f62a38e2b7d8ba1f89eddb83a39f607171938adee55a378f7c8084472642286c6cdf6be747073275a1004893529192f55ee589f059391eee"

RPROVIDES:${PN} += "xengine \
xengine(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
