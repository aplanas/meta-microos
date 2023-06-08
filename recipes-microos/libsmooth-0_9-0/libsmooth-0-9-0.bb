SUMMARY = "C++ class library for widgets, IO, XML and more"
DESCRIPTION = "smooth is an object oriented C++ class library. It provides basic \
functionality and platform support for applications and libraries. \
 \
Features provided by smooth include: \
 \
  * user interface API with various widgets \
  * multithreading API \
  * file and network IO interface \
  * transparent Unicode and software internationalization support \
  * a libxml2-based XML parser"
LICENSE = "Artistic-2.0"

PV = "0.9.9"

RPM_NAME = "libsmooth-0_9-0-0.9.9-1.5.aarch64.rpm"
RPM_HASH = "3b2ec37f527ea628126b83726e68db33929e696f8e2978a13daf3fa44d187d40128475ac02ba464ab60969762517725d2b9f6d77d97ee86d4e7b1c5b89f9d21a"

RPROVIDES:${PN} += "libsmooth-0.9.so.0()(64bit) libsmooth-0_9-0 libsmooth-0_9-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcpuid.so.16()(64bit) libcurl.so.4()(64bit) libfribidi.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit)"

inherit rpm
