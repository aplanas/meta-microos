SUMMARY = "UDP-based Data Transfer Protocol"
DESCRIPTION = "UDT is a reliable UDP-based application level data transport protocol \
for distributed data intensive applications over wide area high-speed \
networks. UDT uses UDP to transfer bulk data with its own reliability \
control and congestion control mechanisms. The new protocol can \
transfer data at a much higher speed than TCP does. UDT is also a \
highly configurable framework that can accommodate various congestion \
control algorithms. \
 \
This package provides the libraries used by applications to use UDT."
LICENSE = "BSD-3-Clause"

PV = "4.11"

RPM_NAME = "libudt0-4.11-1.22.aarch64.rpm"
RPM_HASH = "73fbb2578711e1018c6f78a1bfd9153588e344a07c34623497825d6fe43167c1368ca7d06d54b3834b4b1cd7ca7e897a9e9ec9a89dddeaf5bdf0ff727038a35a"

RPROVIDES:${PN} += "libudt.so.0()(64bit) libudt0 libudt0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
