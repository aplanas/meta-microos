SUMMARY = "Development files for python310-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-Kivy-devel-2.1.0-3.6.aarch64.rpm"
RPM_HASH = "c2038c17f6f4c8780da3abf590f7bc19cbc19c9f6ee6f48f66dfc774f8eb48a422bb6ccb780edd174d767f43ad8fa5428c96c7ca06e225811fef6a2e50173869"

RPROVIDES:${PN} += "python3-Kivy-devel python310-Kivy-devel python310-Kivy-devel(aarch-64)"
RDEPENDS:${PN} += "python310-Kivy"

inherit rpm
