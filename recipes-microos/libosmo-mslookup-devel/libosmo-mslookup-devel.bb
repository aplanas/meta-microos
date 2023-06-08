SUMMARY = "Development files for the Osmocom MS lookup library"
DESCRIPTION = "This shared library contains routines for looking up mobile subscribers. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mslookup."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-mslookup-devel-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "2e99866b145cd94a206a4840b0006f6442119bd68d5b6c01dac231c4cc82a5982d51127cb0f3485f2e684607439e747bfd4b9a464398aa9d0b21d864d8df4be5"

RPROVIDES:${PN} += "libosmo-mslookup-devel libosmo-mslookup-devel(aarch-64) pkgconfig(libosmo-mslookup)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-mslookup0"

inherit rpm
