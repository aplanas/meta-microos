SUMMARY = "Development Libraries and Header Files for liboop"
DESCRIPTION = "This package contains the static libraries and header files needed to \
develop programs which make use of the liboop programming interface."
LICENSE = "LGPL-2.1+"

PV = "1.0.1"

RPM_NAME = "liboop-devel-1.0.1-2.19.aarch64.rpm"
RPM_HASH = "26932388aa1c2c3e6829a435f5f3bbc0804a1a08e3c27cdf92d135ae9f8ad5bc56739fbbf734af2d5fb7d5df1dc1dcdfa60f3bbf038fa20745fb2e234ba0db35"

RPROVIDES:${PN} += "liboop-devel \
liboop-devel(aarch-64) \
pkgconfig(liboop) \
pkgconfig(liboop-glib2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboop4 \
pkgconfig(glib-2.0)"

inherit rpm
