SUMMARY = "Trusted Platform Module (TPM) 2.0 administration tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm2.0-tools package \
provides tools for enablement and configuration of the TPM 2.0 and \
associated interfaces."
LICENSE = "BSD-3-Clause"

PV = "5.5"

RPM_NAME = "tpm2.0-tools-5.5-1.3.aarch64.rpm"
RPM_HASH = "b556a2a00b866ccdde068f6c0e4b3cfe549222a2a6c4dcbfb7b8b3e9ea7fdefd18d1265c49344f7b608411bf8b59715bed4384e1eaed175f7a6f38bd4bc94665"

RPROVIDES:${PN} += "tpm2.0-tools tpm2.0-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libtss2-esys.so.0()(64bit) libtss2-fapi.so.1()(64bit) libtss2-mu.so.0()(64bit) libtss2-rc.so.0()(64bit) libtss2-sys.so.1()(64bit) libtss2-tctildr.so.0()(64bit)"

inherit rpm
