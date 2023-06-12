SUMMARY = "Static library for libdwarf"
DESCRIPTION = "Contains the static library of libdwarf. \
 \
libdwarf is a library of functions to provide read/write DWARF \
debugging records."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0"

RPM_NAME = "libdwarf-devel-static-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "d62013a377d2eefeb32f7472688fe7fa67ff170b7b03a76a24ca93efb4c259482f91734b4812082df6e9c7565493f2e845b4f2a772cfb456e0288263b39fd0e1"

RPROVIDES:${PN} += "libdwarf-devel-static libdwarf-devel-static(aarch-64) libdwarf-devel:/usr/lib64/libdwarf.a"
RDEPENDS:${PN} += "libdwarf-devel"

inherit rpm
