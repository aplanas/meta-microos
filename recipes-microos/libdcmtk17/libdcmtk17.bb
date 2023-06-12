SUMMARY = "DICOM Toolkit"
DESCRIPTION = "DCMTK is a collection of libraries and applications implementing large \
parts the DICOM standard."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "3.6.7"

RPM_NAME = "libdcmtk17-3.6.7-2.2.aarch64.rpm"
RPM_HASH = "c3025a693bb3c008ef440ac26a32a6fe0cd610dbd1597850d8adc0295ffd4ee8d4d32e6a5a9d2875825ff73e1e108be3fa31af0661e797aae19d65079302ebe8"

RPROVIDES:${PN} += "libcmr.so.17()(64bit) libdcmdata.so.17()(64bit) libdcmdsig.so.17()(64bit) libdcmect.so.17()(64bit) libdcmfg.so.17()(64bit) libdcmimage.so.17()(64bit) libdcmimgle.so.17()(64bit) libdcmiod.so.17()(64bit) libdcmjpeg.so.17()(64bit) libdcmjpls.so.17()(64bit) libdcmnet.so.17()(64bit) libdcmpmap.so.17()(64bit) libdcmpstat.so.17()(64bit) libdcmqrdb.so.17()(64bit) libdcmrt.so.17()(64bit) libdcmseg.so.17()(64bit) libdcmsr.so.17()(64bit) libdcmtk17 libdcmtk17(aarch-64) libdcmtk3_6 libdcmtkcharls.so.17()(64bit) libdcmtls.so.17()(64bit) libdcmtract.so.17()(64bit) libdcmwlm.so.17()(64bit) libi2d.so.17()(64bit) libijg12.so.17()(64bit) libijg16.so.17()(64bit) libijg8.so.17()(64bit) liboflog.so.17()(64bit) libofstd.so.17()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.73()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libwrap.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit)"

inherit rpm
