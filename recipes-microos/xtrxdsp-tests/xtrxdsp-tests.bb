SUMMARY = "Test tools for the XTRX DSP library"
DESCRIPTION = "Test tools for the XTRX DSP library."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "xtrxdsp-tests-0.0.0+git.20190830-2.6.aarch64.rpm"
RPM_HASH = "90cc478a519ac0922eb21ba644781d6b79319bc15cce1e22f18f69a91c58d59b97869611887317cb44cab3c4c09aa9674b1cbfaf6585522a373de1223c4ad253"

RPROVIDES:${PN} += "xtrxdsp-tests xtrxdsp-tests(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxtrxdsp.so.0()(64bit)"

inherit rpm
