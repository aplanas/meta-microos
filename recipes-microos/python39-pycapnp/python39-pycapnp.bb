SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python39-pycapnp-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "efe2a7959cdf880e76f6fd9738273e5c199f0f8b5aeb538b34336364faaacbf472bde6f41afc221ad10dd483541eb90a451d0b071ae2aa7e59810e6909d65ba3"

RPROVIDES:${PN} += "python3.9dist(pycapnp) python39-pycapnp python39-pycapnp(aarch-64) python3dist(pycapnp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcapnp-0.10.4.so()(64bit) libcapnp-rpc-0.10.4.so()(64bit) libcapnpc-0.10.4.so()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkj-0.10.4.so()(64bit) libkj-async-0.10.4.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi)"

inherit rpm
