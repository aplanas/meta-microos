SUMMARY = "Devel files for tpm2-tss-engine"
DESCRIPTION = "Development files for tpm2-tss-engine, an OpenSSL engine for TPM2 devices. \
 \
The tpm2-tss-engine project implements a cryptographic engine for OpenSSL for \
Trusted Platform Module (TPM 2.0) using the tpm2-tss software stack that follows \
the Trusted Computing Groups (TCG) TPM Software Stack (TSS 2.0). It uses the \
Enhanced System API (ESAPI) interface of the TSS 2.0 for downwards communication. \
It supports RSA decryption and signatures as well as ECDSA signatures."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-devel-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "962a9e1502bb57a0dac7f2ef1a1192dd3c4fa11b4c1b5a0eb4d5187bc3fabc3254307dc9ad1732bd2d6eb545dc62c565a15ebab4a8079c2de1098f52d5b5cb2d"

RPROVIDES:${PN} += "tpm2-tss-engine-devel tpm2-tss-engine-devel(aarch-64)"
RDEPENDS:${PN} += "tpm2-tss-engine"

inherit rpm
