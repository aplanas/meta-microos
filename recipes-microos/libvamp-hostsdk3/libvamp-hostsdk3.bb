SUMMARY = "Library for Vamp audio analysis plugin hosts"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "libvamp-hostsdk3-2.10.0-1.12.aarch64.rpm"
RPM_HASH = "7f72a7526bf1ece3875955a48480addb6bb7759029c9f379e9220b3b04e328227cb263f338ad5fbd5f973de1567924f6b0e0e6c8c7e5cc0cd6632634985b4108"

RPROVIDES:${PN} += "libvamp-hostsdk.so.3()(64bit) libvamp-hostsdk3 libvamp-hostsdk3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.35)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
