SUMMARY = "A suite of programs to modify Transport Tycoon Deluxe's GRF files"
DESCRIPTION = "A suite of programs to modify Transport Tycoon Deluxe's GRF files. \
Contains GRFCodec for encoding and decoding the actual GRF files, \
GRFDiff and GRFMerge for making and applying patches for GRF files, \
GRFID for extracting the (unique) NewGRF identifier and NFORenum, \
a format correcter and linter for the NFO language. NFO and PCX \
or PNG files are encoded to form GRF files."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.6+39"

RPM_NAME = "grfcodec-6.0.6+39-1.9.aarch64.rpm"
RPM_HASH = "f9e3ad3014ff6a9c44d352a5450ac1672b24e46b081de5fe606e34951dca257a7042ebd07dbe97e6d307d2182c812f9f4d7e81b2e982d9ed2539b25b21088c65"

RPROVIDES:${PN} += "grfcodec grfcodec(aarch-64) nforenum"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
