SUMMARY = "Tools to transform Adobe PageMaker documents into other formats"
DESCRIPTION = "Tools to transform Adobe PageMaker documents into other formats. \
Currently supported: SVG, raw."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-tools-0.0.4-1.29.aarch64.rpm"
RPM_HASH = "d650af919fdecae9ad4ac37012d78431a5b3e6c52b77359d981fa5a658f51e446de97f12295c7ffdfd4ffb69ecf9d933961f0bf2941563bdad49ad36c9617e11"

RPROVIDES:${PN} += "libpagemaker-tools libpagemaker-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpagemaker-0.0.so.0()(64bit) librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
