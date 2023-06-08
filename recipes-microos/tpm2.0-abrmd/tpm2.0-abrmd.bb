SUMMARY = "Intel's TCG Software Stack Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "The tpm2.0-abrmd package provides the TPM2 Access Broker & Resource Manager. \
This is a daemon service that coordinates requests to the TPM2 chip via \
Intel's TPM 2.0 software stack."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "2e610e742c7560c7b9fa296f5152e2ead7726f4d8a0d79f0a8ae5872a4029ec6958a5c181eedb595f98563ecbc24e3bafc0d7f7188fd3a83e4e179620ce4bb25"

RPROVIDES:${PN} += "tpm2.0-abrmd tpm2.0-abrmd(aarch-64)"
RDEPENDS:${PN} += "(tpm2.0-abrmd-selinux if selinux-policy-base) /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtss2-mu.so.0()(64bit) libtss2-rc.so.0()(64bit) libtss2-sys.so.1()(64bit) libtss2-tcti-device0 libtss2-tcti-tabrmd0 libtss2-tctildr.so.0()(64bit) tpm2-0-tss user(tss)"

inherit rpm
