SUMMARY = "Python bindings for TSS"
DESCRIPTION = "TPM2 TSS Python bindings for Enhanced System API (ESYS), Feature API \
(FAPI), Marshaling (MU), TCTI Loader (TCTILdr) and RC Decoding \
(rcdecode) libraries. It also contains utility methods for wrapping \
keys to TPM 2.0 data structures for importation into the TPM, \
unwrapping keys and exporting them from the TPM, TPM-less \
makecredential command and name calculations, TSS2 PEM Key format \
support, importing Keys from PEM, DER and SSH formats, conversion from \
tpm2-tools based command line strings and loading tpm2-tools context \
files."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python3-tpm2-pytss-2.1.0-2.2.aarch64.rpm"
RPM_HASH = "2c3f88fd1df2937b2ca77be842a039742f60be67bfb0b128baed99fc4c11fe22a3622fd0dc1068ebecb53860e838692d32e5d680a6f2229aa22d5a151232e71a"

RPROVIDES:${PN} += "python3-tpm2-pytss python3-tpm2-pytss(aarch-64) python3.10dist(tpm2-pytss) python3dist(tpm2-pytss)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtss2-esys.so.0()(64bit) libtss2-fapi.so.1()(64bit) libtss2-mu.so.0()(64bit) libtss2-policy.so.0()(64bit) libtss2-rc.so.0()(64bit) libtss2-tcti-spi-helper.so.0()(64bit) libtss2-tctildr.so.0()(64bit) pkgconfig(tss2-esys) pkgconfig(tss2-fapi) python(abi) python3-PyYAML python3-asn1crypto python3-cffi python3-cryptography python3-packaging python3-setuptools"

inherit rpm
