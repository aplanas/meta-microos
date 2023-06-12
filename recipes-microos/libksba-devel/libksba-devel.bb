SUMMARY = "A X.509 Library"
DESCRIPTION = "KSBA is a library to simplify the task of working with X.509 \
certificates, CMS data, and related data. \
 \
This package contains the needed files to compile and link against the \
libksba."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later & MIT"

PV = "1.6.3"

RPM_NAME = "libksba-devel-1.6.3-1.3.aarch64.rpm"
RPM_HASH = "77b4e2f9ddd4ce70c625a102391a4a05d77f3b03b6600143c36ffaf3308ae820d64fd380e468df9c9f229b28d7b21d787971ea6eb154e4ec70006d2f5a1f19ab"

RPROVIDES:${PN} += "libksba-devel \
libksba-devel(aarch-64) \
libksba:/usr/include/ksba.h \
pkgconfig(ksba)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libksba8 \
pkgconfig(gpg-error)"

inherit rpm
