SUMMARY = "Network performance meter for the UDP, TCP, SCTP and DCCP protocols"
DESCRIPTION = "NetPerfMeter is a network performance meter for the UDP, TCP, SCTP \
and DCCP transport protocols over IPv4 and IPv6. It simultaneously \
transmits bidirectional flows to an endpoint and measures the \
resulting flow bandwidths and QoS. The results are written as \
vector and scalar files. \
The vector files can e.g. be used to create plots of the results."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "netperfmeter-1.9.0-1.9.aarch64.rpm"
RPM_HASH = "83341d775b06896ddf165c8b0f4b9d183522d7bc3fe666c9e7adab85adb9fc7b8ad0de1d8d0b5109a59ad91fe120e79f4acf98e0db6083d94bc884141a784ace"

RPROVIDES:${PN} += "netperfmeter \
netperfmeter(aarch-64)"
RDEPENDS:${PN} += "libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
