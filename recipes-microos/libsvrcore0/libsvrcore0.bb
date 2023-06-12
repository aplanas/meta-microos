SUMMARY = "Secure PIN handling using NSS crypto"
DESCRIPTION = "svrcore provides applications with several ways to handle secure PIN storage \
e.g. in an application that must be restarted, but needs the PIN to unlock \
the private key and other crypto material, without user intervention.  svrcore \
uses the facilities provided by NSS."
LICENSE = "MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "libsvrcore0-2.4.0~git18.37ec5cd-1.2.aarch64.rpm"
RPM_HASH = "96a56259c7d7519857bb023d571f3dd14b5b2969ec9e5cd0fc570ac2d283d165bb81cc83c3b499b5a567a00e122b453625c25b0e51cd7709f109b661b330a455"

RPROVIDES:${PN} += "libsvrcore.so.0()(64bit) libsvrcore0 libsvrcore0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.10.2)(64bit) libnss3.so(NSS_3.2)(64bit)"

inherit rpm
