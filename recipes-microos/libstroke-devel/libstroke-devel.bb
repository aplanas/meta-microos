SUMMARY = "Development package for libstroke"
DESCRIPTION = "This package is needed if you want to program or compile applications \
that use libstroke."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libstroke-devel-0.5.1-234.3.aarch64.rpm"
RPM_HASH = "cd78650e1341a5ae1ad3589c9bbfc86f98b43428f54a97ffc7105aa2c4d64b7ac748794aee2e9c3f32518503b04e5e3ba69aeecb4d2bdf72b6cabb378675f92f"

RPROVIDES:${PN} += "libstroke-devel \
libstroke-devel(aarch-64)"
RDEPENDS:${PN} += "libstroke0 \
pkgconfig(x11)"

inherit rpm
