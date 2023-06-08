SUMMARY = "Development files for python311-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-Kivy-devel-2.1.0-3.6.aarch64.rpm"
RPM_HASH = "acefaa47199de1e54930cd8271fc7dcf69661e7f48f3623c0f622580b0aa3784590fbd2234944976b0f1e7e57a915b1bfaedbe71df622ec8f80feb060fc21626"

RPROVIDES:${PN} += "python311-Kivy-devel python311-Kivy-devel(aarch-64)"
RDEPENDS:${PN} += "python311-Kivy"

inherit rpm
