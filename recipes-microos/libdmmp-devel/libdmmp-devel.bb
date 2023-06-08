SUMMARY = "Header files for multipath-tools C API"
DESCRIPTION = "This package provides development files and documentation for libdmmp."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4+86+suse.4d8901e"

RPM_NAME = "libdmmp-devel-0.9.4+86+suse.4d8901e-1.1.aarch64.rpm"
RPM_HASH = "2b709eb3fb59f554f5b895ffbe19aa5082d3a54187e5cce1ee2797d59ecbc04d660b51c5721471e929e42028ebbe75b2b5e603cda8951df21b2b046e892ed48b"

RPROVIDES:${PN} += "libdmmp-devel libdmmp-devel(aarch-64) pkgconfig(libdmmp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdmmp0_2_0"

inherit rpm
