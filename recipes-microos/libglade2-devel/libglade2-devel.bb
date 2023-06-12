SUMMARY = "Include files and libraries mandatory for development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and link applications that use libglade2."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.4"

RPM_NAME = "libglade2-devel-2.6.4-28.3.aarch64.rpm"
RPM_HASH = "946eef00fe0d2c3240aa87db48d474af00201eb7e6d30c48664f904dcc541bd4911d38b27b6d0a756249037487c9ba2f2ddba902377c0caa06b47dc2586d0897"

RPROVIDES:${PN} += "libglade2-devel \
libglade2-devel(aarch-64) \
pkgconfig(libglade-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
libglade-2_0-0 \
pkgconfig(gtk+-2.0) \
pkgconfig(libxml-2.0)"

inherit rpm
