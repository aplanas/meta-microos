SUMMARY = "Documentation for Kivy, a multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python-Kivy-doc-2.1.0-3.6.aarch64.rpm"
RPM_HASH = "4d2293d712f47559abb701f66b68503a7f27cebf1846a60209ac2bd17ad2b4377a9b5c4d8bba4a0863daf4eafae2e8762768d8e1552fa9358716b529e47b2631"

RPROVIDES:${PN} += "python-Kivy-doc python-Kivy-doc(aarch-64) python310-Kivy-doc python311-Kivy-doc python39-Kivy-doc"
RDEPENDS:${PN} += ""

inherit rpm
