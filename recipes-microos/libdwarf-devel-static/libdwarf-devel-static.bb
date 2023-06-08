SUMMARY = "Static library for libdwarf"
DESCRIPTION = "Contains the static library of libdwarf. \
 \
libdwarf is a library of functions to provide read/write DWARF \
debugging records."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libdwarf-devel-static-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "3a6ba74c73b98e8d5006af780353470dc678cfd655f2708212164bfe2a550141b93073ecae04ab493e8d6b17a7d576f6b580f2d998b590d2d91cbe595ea5f36e"

RPROVIDES:${PN} += "libdwarf-devel-static libdwarf-devel-static(aarch-64) libdwarf-devel:/usr/lib64/libdwarf.a"
RDEPENDS:${PN} += "libdwarf-devel"

inherit rpm
