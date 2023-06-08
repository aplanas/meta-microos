SUMMARY = "Whole Slide Imaging for Orthanc"
DESCRIPTION = "The Orthanc project provides three official tools to support DICOM for whole-slide microscopic imaging (WSI): \
- A so-called “DICOM-izer” command-line tool that converts whole-slide images to DICOM series, following Supplement 145. \
- A plugin that extends Orthanc with a Web viewer of whole-slide images for digital pathology. \
- Another command-line tool that converts a DICOM series stored inside Orthanc, to a standard hierarchical TIFF image."
LICENSE = "AGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "orthanc-wsi-1.1-2.11.aarch64.rpm"
RPM_HASH = "2c58a3d5ff4656e668c30ef927590abf42cc50d6f384db3f87a6ac7cfb7387818cc5aade91c8d91afd903cd1acb4b05e8edaf76683cee7d567fc6e779250fe47"

RPROVIDES:${PN} += "libOrthancWSI.so.1.1()(64bit) orthanc-wsi orthanc-wsi(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_filesystem.so.1.82.0()(64bit) libboost_iostreams.so.1.82.0()(64bit) libboost_locale.so.1.82.0()(64bit) libboost_program_options.so.1.82.0()(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libdcmdata.so.17()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libjsoncpp.so.25()(64bit) libofstd.so.17()(64bit) libopenjp2.so.7()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libz.so.1()(64bit) orthanc"

inherit rpm
