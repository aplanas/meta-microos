SUMMARY = "Static libraries for libattr development"
DESCRIPTION = "This package contains the static library of libattr which is needed for \
staticallly linking to programs that make use of extended attributes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.1"

RPM_NAME = "libattr-devel-static-2.5.1-1.20.aarch64.rpm"
RPM_HASH = "69c453ac83a250bf3c11a446b8e3ba6331d2950cecc423449e2772eef386dae9d9ee445d3a3abc1e960abe7a55d9d123878ef00751d45762d590d798a20174f1"

RPROVIDES:${PN} += "libattr-devel-static libattr-devel-static(aarch-64) libattr-devel:/usr/lib64/libattr.a"
RDEPENDS:${PN} += "libattr-devel"

inherit rpm
