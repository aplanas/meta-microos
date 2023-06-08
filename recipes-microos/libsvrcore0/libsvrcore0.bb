SUMMARY = "Secure PIN handling using NSS crypto"
DESCRIPTION = "svrcore provides applications with several ways to handle secure PIN storage \
e.g. in an application that must be restarted, but needs the PIN to unlock \
the private key and other crypto material, without user intervention.  svrcore \
uses the facilities provided by NSS."
LICENSE = "MPL-2.0"

PV = "2.4.0~git0.87efeb2"

RPM_NAME = "libsvrcore0-2.4.0~git0.87efeb2-1.1.aarch64.rpm"
RPM_HASH = "4f3485e3896f0311bb768f972805d876ebbcb9b6cc733d020be37a84bc9a5dacf3037d2f117949e70c8d96bedab3dc598b09c2783516ee5d6cf463a4bf248415"

RPROVIDES:${PN} += "libsvrcore.so.0()(64bit) libsvrcore0 libsvrcore0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.10.2)(64bit) libnss3.so(NSS_3.2)(64bit)"

inherit rpm
