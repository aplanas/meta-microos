SUMMARY = "Tools to transform QuarkXPress documents into other formats"
DESCRIPTION = "Tools to transform QuarkXPress documents into other formats. \
Currently supported: SVG, plain text, raw."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libqxp-tools-0.0.2-1.19.aarch64.rpm"
RPM_HASH = "71e1a0d82253c0b7c4bffa282e1c61d4b37d9e16838ff9c3f5e2e956e253cc4c8a723a0695749108fb1a4daba52308aa512dd289c791e918d43ddb404e02145f"

RPROVIDES:${PN} += "libqxp-tools libqxp-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqxp-0.0.so.0()(64bit) libqxp-0_0-0 librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
