SUMMARY = "FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libipa_hbac0-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "ec0e35db003033a04971691ef9eb4e2aa10aac440e0ac9cb973bac92f64e4579e803cafcc90c1c2569b37f8a804382f6e38e54304019212c21c3d621d610349f"

RPROVIDES:${PN} += "libipa_hbac.so.0()(64bit) libipa_hbac.so.0(IPA_HBAC_0.0.1)(64bit) libipa_hbac.so.0(IPA_HBAC_0.1.0)(64bit) libipa_hbac0 libipa_hbac0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libunistring.so.5()(64bit)"

inherit rpm
