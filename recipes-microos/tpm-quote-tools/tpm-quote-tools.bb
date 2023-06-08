SUMMARY = "Trusted Platform Module (TPM) remote attestation tools"
DESCRIPTION = "Trusted Computing is a set of specifications published by the Trusted \
Computing Group (TCG). The Trusted Platform Module (TPM) is the \
hardware component for Trusted Computing. The tpm-quote-tools package \
provides additional tools that employ the TPM quote command to facilitate \
remote attestation. These tools are based on the trousers TPM 1.2 stack."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "tpm-quote-tools-1.0.4-1.22.aarch64.rpm"
RPM_HASH = "b804fa9191df787001173ea6d4ff3edf23911593fea8a1cd9e1e3fdad8abe819c73e032dba59dd1c37474fdd147899278f6ca77c2f781a8a56541f48eafb23e2"

RPROVIDES:${PN} += "tpm-quote-tools tpm-quote-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libtspi.so.1()(64bit)"

inherit rpm
