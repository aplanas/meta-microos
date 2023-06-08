SUMMARY = "OpenSAML XMLTooling library"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.2.3"

RPM_NAME = "libxmltooling-lite10-3.2.3-1.4.aarch64.rpm"
RPM_HASH = "26ef87a64891f1286f8778999cb1ead3e519af97240374959de7289ed3acdd340bacbf2fab36b4bd25e26722882e7b1f7e4e35552cbf09daf579860f03b1eb89"

RPROVIDES:${PN} += "libxmltooling-lite.so.10()(64bit) libxmltooling-lite10 libxmltooling-lite10(aarch-64) xmltooling"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblog4shib.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxerces-c-3.2.so()(64bit) libz.so.1()(64bit)"

inherit rpm
