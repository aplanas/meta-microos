SUMMARY = "TPM2 FAPI policy library"
DESCRIPTION = "Library that exposes the internal FAPI policy engine as a consumable \
library and stable API. Users can take arbitrary JSON policy strings \
and implement the callbacks required to produce calculated policies \
without a TPM as well as execute policies on an ESYS TR session for \
satisfying access policies on an object."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-policy0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "8762e81bc3b643dbef143555d9ea76b1cf640291b5ae82625281a2d90b82fb7cda37c569c02579e2f781d14d31b75d122bdfbe1366b26f20790d738793997367"

RPROVIDES:${PN} += "libtss2-policy.so.0()(64bit) libtss2-policy0 libtss2-policy0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libtss2-esys.so.0()(64bit) libtss2-mu.so.0()(64bit)"

inherit rpm
