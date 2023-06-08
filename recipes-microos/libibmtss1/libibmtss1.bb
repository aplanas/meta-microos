SUMMARY = "Shared library for IBM's TPM 2.0 TSS"
DESCRIPTION = "Shared library for IBM's TPM 2.0 TSS tools"
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libibmtss1-1.6.0-4.4.aarch64.rpm"
RPM_HASH = "4c6ee02afe62b13d357bca661cc1cac4ffb47e3b0e14c83048fa6efcfdb21ace49a0d81fad19fb2828ddbbad393be91702cde984bfb12011ec1a713db62fb370"

RPROVIDES:${PN} += "libibmtss.so.1()(64bit) libibmtss1 libibmtss1(aarch-64) libibmtssutils.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
