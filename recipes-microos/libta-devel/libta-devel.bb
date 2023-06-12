SUMMARY = "Technical Analysis Library"
DESCRIPTION = " \
TA-Lib provides common functions for the technical analysis of stock/future/commodity market data."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "libta-devel-0.4.0-1.9.aarch64.rpm"
RPM_HASH = "6f8aa370e5484ed1849273550c569bab0867478704b91963e2bf560aeaba2549249cec01cc4505ae68f286f93a23071fdd47e166bf77284a526ca631dcda9f59"

RPROVIDES:${PN} += "libta-devel \
libta-devel(aarch-64) \
ta-lib-devel"
RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
libta_lib0"

inherit rpm
