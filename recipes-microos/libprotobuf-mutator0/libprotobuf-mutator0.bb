SUMMARY = "Shared library for libprotobuf-mutator"
DESCRIPTION = "Shared library for libprotobuf-mutator - a library to randomly mutate \
protobuffers."
LICENSE = "Apache-2.0"

PV = "20190610"

RPM_NAME = "libprotobuf-mutator0-20190610-1.28.aarch64.rpm"
RPM_HASH = "c5ae3666deabd27a40fdf666a9e78dc77d3f0f9662634bc4589382cc5797b450e05cd7c66c942110e58e7a1629ba5216b3e614c060038de6fbf76757082e913a"

RPROVIDES:${PN} += "libprotobuf-mutator-libfuzzer.so.0()(64bit) \
libprotobuf-mutator.so.0()(64bit) \
libprotobuf-mutator0 \
libprotobuf-mutator0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
