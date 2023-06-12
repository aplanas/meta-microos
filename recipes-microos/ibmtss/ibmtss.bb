SUMMARY = "IBM's TPM 2.0 TSS"
DESCRIPTION = "This is a user space TCG Software Stack (TSS) for TPM 2.0. It \
implements the functionality equivalent to the TCG TSS working \
group's planned ESAPI, SAPI, and TCTI APIs. \
 \
It comes with over 100 'TPM tools' that can be used for scripted \
apps, rapid prototyping, education, and debugging."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ibmtss-1.6.0-4.4.aarch64.rpm"
RPM_HASH = "bf92fdde4ae0adfd78192a0e36c7c453c5a3cfa7ad2612cbc8f8bd0ec1c9a44bf38debe09c3e50433d29438cb81b40af7a810f7b7c4755387f39a2ddcabead48"

RPROVIDES:${PN} += "ibmtss \
ibmtss(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libibmtss.so.1()(64bit) \
libibmtssutils.so.1()(64bit)"

inherit rpm
