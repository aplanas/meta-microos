SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to work with various xml streams."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "liborcus-tools-0.17.2-3.4.aarch64.rpm"
RPM_HASH = "545685dead742f3b58ebe35e6a3590d92429bf8e4d9a1bf5546fa1e4bfcd108d9043e2fcee0a500b671b07bbce167b8900b94c407adb4484a2b36b39d0fa79d1"

RPROVIDES:${PN} += "liborcus-tools \
liborcus-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liborcus-0.17.so.0()(64bit) \
liborcus-0_17-0 \
liborcus-mso-0.17.so.0()(64bit) \
liborcus-parser-0.17.so.0()(64bit) \
liborcus-spreadsheet-model-0.17.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
