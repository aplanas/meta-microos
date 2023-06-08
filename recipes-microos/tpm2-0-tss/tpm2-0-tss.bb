SUMMARY = "Intel's TCG Software Stack access libraries for TPM 2.0 chips"
DESCRIPTION = "The tpm2-0-tss package provides a TPM 2.0 TSS implementation. This \
implementation is developed by INTEL. This package contains the libraries, \
see the tpm2.0-abrmd package for the resource manager daemon, tpm2.0-tools for \
utilities."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "tpm2-0-tss-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "9fdb0391345a874fea6538568afb39dd4fb3244a92d2c7624bb0ee366e0271ba048301ad585a01c5b8d1c680c927e8eeda9f7a8ab8e7e5b64ae4dac63f8d3943"

RPROVIDES:${PN} += "config(tpm2-0-tss) tpm2-0-tss tpm2-0-tss(aarch-64)"
RDEPENDS:${PN} += "/bin/sh user(tss)"

inherit rpm
