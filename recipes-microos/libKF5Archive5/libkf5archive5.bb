SUMMARY = "Qt 5 addon providing access to numerous types of archives"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Archive5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "3cec0e4ee4009b1d04550a99684654aa3f60b4a008bda7caf9edd1f59e07d2edfc60d38c55006a7d87fac3ddb19afe724a187b94a16f63514e9c531ce286f2f2"

RPROVIDES:${PN} += "libKF5Archive.so.5()(64bit) libKF5Archive5 libKF5Archive5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libbz2.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
