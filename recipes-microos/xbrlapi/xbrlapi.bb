SUMMARY = "X BrlAPI helper"
DESCRIPTION = "The xbrlapi utility is a helper to have BrlAPI work on a X system."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "xbrlapi-6.5-2.3.aarch64.rpm"
RPM_HASH = "36dbd43eed0291ddebcebd688070a46e001ba5900c2892c248410be97b6d964f1687b4565749c83e4d0ab09811795b9987c0f43534e4a593fc1f763073b48e76"

RPROVIDES:${PN} += "xbrlapi xbrlapi(aarch-64)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXfixes.so.3()(64bit) libXtst.so.6()(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.34)(64bit) libicuuc.so.72()(64bit)"

inherit rpm
