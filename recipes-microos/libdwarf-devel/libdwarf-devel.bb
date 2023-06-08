SUMMARY = "Development files for libdwarf"
DESCRIPTION = "Contains the static libraries and header files of libdwarf. \
 \
libdwarf is a library of functions to provide read/write DWARF \
debugging records."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libdwarf-devel-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "c2277d839059135740b71aee6095ad7d7eff67d7bcc4fc9cb69f6d14414d6108d51f557226f9e37a5b4cb81b2e5b07d30e53ea4267050cf513b04695e92eaffd"

RPROVIDES:${PN} += "libdwarf-devel libdwarf-devel(aarch-64) pkgconfig(libdwarf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdwarf0 libelf-devel pkgconfig(libzstd) pkgconfig(zlib)"

inherit rpm
