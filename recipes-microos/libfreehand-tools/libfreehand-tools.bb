SUMMARY = "Tools to work with Adobe/Macromedia drawings"
DESCRIPTION = "This package contains tools to work with Adobe/Macromedia drawings."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-tools-0.1.2-2.18.aarch64.rpm"
RPM_HASH = "27b68a7dff58105edfcb5c7cb52f09e86b7485fac2e28d55dc678f86d9beb1cc9d35b45fbd6afbadc410a58f23c5a71ca005c6e8a842e585589c115072750195"

RPROVIDES:${PN} += "libfreehand-tools \
libfreehand-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreehand-0.1.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-generators-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
