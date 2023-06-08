SUMMARY = "Shared library for sword"
DESCRIPTION = "This package contains the shared library for applications using sword."
LICENSE = "GPL-2.0-only & Apache-2.0"

PV = "1.8.1"

RPM_NAME = "libsword-1_8_1-1.8.1-1.32.aarch64.rpm"
RPM_HASH = "a370f4b24b5716ec0a0bf6814569f26844f3bfa8aa2a47b8336741733eed8affd995ec48a809c0450593465176aff3cb1ace42d5050b5d64510d82a670a1f275"

RPROVIDES:${PN} += "libsword-1.8.1.so()(64bit) libsword-1_8_1 libsword-1_8_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libclucene-core.so.1()(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
