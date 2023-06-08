SUMMARY = "PDF to DjVu Converter"
DESCRIPTION = "pdf2djvu creates DjVu files from PDF files. It's able to extract: \
graphics, text layer, hyperlinks, document outline (bookmarks) and \
metadata (including XMP metadata)."
LICENSE = "GPL-2.0-only"

PV = "0.9.19"

RPM_NAME = "pdf2djvu-0.9.19-3.5.aarch64.rpm"
RPM_HASH = "b6c0aa4e11a306a7fa2052e1d843bb716fda7957845c7c9140fac1150170c46d3570eee801efefb07b74993aec4db001d8a697b970833bfe0c70a2071671e8a9"

RPROVIDES:${PN} += "pdf2djvu pdf2djvu(aarch-64)"
RDEPENDS:${PN} += "djvulibre ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGraphicsMagick++-Q16.so.12()(64bit) libGraphicsMagick-Q16.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdjvulibre.so.21()(64bit) libexiv2.so.27()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_5.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.35)(64bit) libpoppler.so.127()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
