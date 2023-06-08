SUMMARY = "Library for parsing the Adobe/Macromedia drawings"
DESCRIPTION = "Libfreehand is library providing ability to interpret and import Adobe/Macromedia \
drawings into various applications. You can find it being used in libreoffice."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-0_1-1-0.1.2-2.18.aarch64.rpm"
RPM_HASH = "57eedb093603c99b13b4cf65d2dff8ac850ce2c0e77028cad5a0b539749aef2bbc7b9cee006b6590ffe559de2f42b32007d88c2b9cb91cb1267ace045760be53"

RPROVIDES:${PN} += "libfreehand-0.1.so.1()(64bit) libfreehand-0_1-1 libfreehand-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
