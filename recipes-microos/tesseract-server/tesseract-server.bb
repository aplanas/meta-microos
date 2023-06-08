SUMMARY = "Tesseract standalone server"
DESCRIPTION = "This package provides the server files for the Tesseract game."
LICENSE = "Zlib"

PV = "2018_02_01"

RPM_NAME = "tesseract-server-2018_02_01-3.11.aarch64.rpm"
RPM_HASH = "99314b57003984ce17f7e33b9bf1776b706a004dbbaaa1b41550d25267cefc2ac97d9151cc56ef539c2c0e1f3920748debed4d5b46cc03b0aca6bf64521f7e05"

RPROVIDES:${PN} += "tesseract-server tesseract-server(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libz.so.1()(64bit)"

inherit rpm
