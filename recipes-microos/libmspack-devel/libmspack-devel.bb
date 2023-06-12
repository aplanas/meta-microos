SUMMARY = "Static libraries, header files and documentation for libmspack"
DESCRIPTION = "The libmspack-devel package contains the header files and static \
libraries necessary for developing programs using libmspack."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "libmspack-devel-0.11-1.3.aarch64.rpm"
RPM_HASH = "fa39a80475c3304432f23ef22d4327b67b16f552e28be2ea49e728b6041053d71af38ed6aecfdb62654aae88d75a972452817779b0d92f4391baea2d0f1ff676"

RPROVIDES:${PN} += "libmspack-devel \
libmspack-devel(aarch-64) \
pkgconfig(libmspack)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmspack0"

inherit rpm
