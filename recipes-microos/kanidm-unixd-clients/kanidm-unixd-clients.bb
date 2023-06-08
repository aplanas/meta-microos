SUMMARY = "Client nsswitch/pam/ssh integration for consuming kanidm"
DESCRIPTION = "A localhost resolver and libraries that allow a system to resolve posix \
identities to a kanidm instance."
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha11~git0.d3a2a6b"

RPM_NAME = "kanidm-unixd-clients-1.1.0~alpha11~git0.d3a2a6b-3.1.aarch64.rpm"
RPM_HASH = "99da97121a31881dd4688957e2e69b0826b18f2e75b4bd044b05fdf398cd5086f6d72b4c0fdc8eec81ec989e82ddcb26e788aa340dc5a33fe62e1f3996dd99bb"

RPROVIDES:${PN} += "kanidm-unixd-clients kanidm-unixd-clients(aarch-64) libnss_kanidm.so.2()(64bit)"
RDEPENDS:${PN} += "/bin/sh kanidm-clients libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
