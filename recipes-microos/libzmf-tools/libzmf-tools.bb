SUMMARY = "Tools for converting the Zoner ZMF files"
DESCRIPTION = "Tools to work with the Zoner ZMF files, based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-tools-0.0.2-1.43.aarch64.rpm"
RPM_HASH = "c4f546917c8566934fbdeb01e395ba3864495136f6a84b38019f539428049da4d365ae75ec23e035026437bff02d07dce01ac5ccfdcbca698666e78a9df6bcb3"

RPROVIDES:${PN} += "libzmf-tools libzmf-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libzmf-0.0.so.0()(64bit)"

inherit rpm
