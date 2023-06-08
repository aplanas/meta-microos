SUMMARY = "Development files for GNU Mailutils"
DESCRIPTION = "This package includes libraries and header files for building tools to \
access mailutils features."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.15"

RPM_NAME = "mailutils-devel-3.15-2.4.aarch64.rpm"
RPM_HASH = "5ea0c48aab04a07780a5ded4bcd9deb5e138673400fbdb03407a7f07f6323f73cd1d3a7a59d040d5115792c76c6ee592fecbedf7ba97bfc73f745d2a0b13b98e"

RPROVIDES:${PN} += "mailutils-devel mailutils-devel(aarch-64)"
RDEPENDS:${PN} += "libmailutils9 mailutils"

inherit rpm
