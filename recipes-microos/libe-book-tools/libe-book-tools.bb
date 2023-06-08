SUMMARY = "Tools to transform e-books into other formats"
DESCRIPTION = "Tools to transform e-books into other formats. \
Currently supported: XHTML, raw, text."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-tools-0.1.3-2.20.aarch64.rpm"
RPM_HASH = "75d9d6a9c1db957e909cd08c24cb5cd64231679b06e2afcff07675e19bc1dc53624848fd22553a26e63c8168652319d3b569cb540a91650d2419349ba609f152"

RPROVIDES:${PN} += "libe-book-tools libe-book-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libe-book-0.1.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) librevenge-0.0.so.0()(64bit) librevenge-generators-0.0.so.0()(64bit) librevenge-stream-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
