SUMMARY = "TPM2 Enhanced System API (ESAPI)"
DESCRIPTION = "This API is a 1-to-1 mapping of the TPM2 commands documented in Part 3 of the \
TPM2 specification. Additionally there are asynchronous versions of each \
command. In addition to SAPI, the ESAPI performs tracking of meta data for \
TPM object and automatic calculation of session based authorization and \
encryption values. Both the synchronous and asynchronous API are exposed \
through this library."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-esys0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "4b3ddba0b3288d952b009d964fbb3fba046711e54eae9cfa16ab6bee147e083fce1be330cd8c13eeadf798d7f9325e83300f40dabe92cf9b640d653f5ada7eab"

RPROVIDES:${PN} += "libtss2-esys.so.0()(64bit) \
libtss2-esys0 \
libtss2-esys0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libtss2-mu.so.0()(64bit) \
libtss2-sys.so.1()(64bit)"

inherit rpm
