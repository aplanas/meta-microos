SUMMARY = "Colour Management Libraries"
DESCRIPTION = "IccLibXML library acts as an extension of SampleICC's IccProfLib. \
This extension provides inherited classes for the classes in IccProfLib \
that provide additional I/O routines to read and write the classes as \
XML files"
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "libIccXML2-0.9.8-2.26.aarch64.rpm"
RPM_HASH = "2786ff9b8f28a0932c00d4a1cabcdce27bd2d1ce0f87174ca5c31fe062920783b6b5cb635a335fa2c9c23274d0811e192f2cb9121a4a97c470ad3a38e339288b"

RPROVIDES:${PN} += "libIccXML.so.2()(64bit) libIccXML2 libIccXML2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSampleICC.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
