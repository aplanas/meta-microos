SUMMARY = "Client tools for interacting with Kanidm"
DESCRIPTION = "Client utilities for interactive with kanidm servers"
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha11~git0.d3a2a6b"

RPM_NAME = "kanidm-clients-1.1.0~alpha11~git0.d3a2a6b-3.1.aarch64.rpm"
RPM_HASH = "6d128fc3fa06a502172bd5e6b3db39a84efac8627f68812be079b655e7a9c323f64586c2942f15546f99fe2229c4bc044fc10a72708e7446477296ce37bceba9"

RPROVIDES:${PN} += "kanidm-clients kanidm-clients(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libz.so.1()(64bit)"

inherit rpm
