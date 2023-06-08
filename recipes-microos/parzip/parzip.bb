SUMMARY = "Parallel pkzip implementation"
DESCRIPTION = "A command line utility to pack and unpack zip archives using \
multiple threads. \
 \
Supports \
    both zipping and unzipping \
    multithreading \
    uncompressed (i.e. stored) files \
    deflate and lzma compression and decompression \
    ZIP64 extensions (i.e. >4 GB files) \
    unix file attributes \
 \
Does not support \
    modifying existing archives \
    encryption (zip encryption is broken, use GPG instead) \
    ancient compression methods \
    archives split to multiple files"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "parzip-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "855433fb43553db6d667d94aa360b463afa567b5aabb5f7846334683295df6a61368fadcc3e84182929fd32a6f07ffd5e630dc22d2c16684960b706294294055"

RPROVIDES:${PN} += "parzip parzip(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libz.so.1()(64bit)"

inherit rpm
