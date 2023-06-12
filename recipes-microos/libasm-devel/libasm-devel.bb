SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libasm."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm-devel-0.189-3.1.aarch64.rpm"
RPM_HASH = "8cc8d5a93a4180e97b804ab8f535fd10be2f7d90ea08d27f11e757989c1fb301527bde736dab9ffb809b453757f045ade8105ad5e033f49becb1a1da70c03f45"

RPROVIDES:${PN} += "libasm-devel \
libasm-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libasm1"

inherit rpm
