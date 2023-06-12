SUMMARY = "Development files for libindi"
DESCRIPTION = "This package contains development files for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "libindi-devel-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "f70d146744b1d829950df964f8b0f4eefc547823898dddb790c507126ff73f96ba9d3b94a0663b1e84a731f46f45131651b22f2599e9319bf892500f1d633529"

RPROVIDES:${PN} += "libindi-devel \
libindi-devel(aarch-64) \
pkgconfig(libindi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libindiAlignmentDriver2 \
libindiclient2 \
libindiclientqt2 \
libindidriver2 \
libindilx200-2"

inherit rpm
