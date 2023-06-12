SUMMARY = "Header and library definition files for lensfun"
DESCRIPTION = "Header and library definition files for developing applications \
that use the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "lensfun-devel-0.3.3-1.7.aarch64.rpm"
RPM_HASH = "a1c4f6a6b7fcedfbdfee358154adf63848bec5f941ba779e12ab53e6f3c0aac60e382ca6b566a57bb49b4f126d3215baa42dac7c36377c5f70090e0911c82f28"

RPROVIDES:${PN} += "lensfun-devel \
lensfun-devel(aarch-64) \
pkgconfig(lensfun)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
lensfun-data \
liblensfun1 \
pkgconfig(glib-2.0)"

inherit rpm
