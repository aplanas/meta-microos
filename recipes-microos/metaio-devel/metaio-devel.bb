SUMMARY = "Development files for libmetaio"
DESCRIPTION = "This package contains the sources and header files needed for developing applications using libmetaio."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "metaio-devel-8.5.1-1.8.aarch64.rpm"
RPM_HASH = "bf2256fc297679359c6a4fd9dec256b61d5ff62bddc37c758449a9d186727edbfa7a9d9afbec31fd471107859a9a9eb3967400f5e3b8b67673d6fab4387a15a0"

RPROVIDES:${PN} += "metaio-devel \
metaio-devel(aarch-64) \
pkgconfig(libmetaio)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmetaio1 \
pkgconfig(zlib)"

inherit rpm
