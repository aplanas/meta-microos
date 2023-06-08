SUMMARY = "Devel Package for libheif"
DESCRIPTION = "libheif is a ISO/IEC 23008-12:2017 HEIF file format decoder and encoder. \
This package contains the header files."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.1"

RPM_NAME = "libheif-devel-1.16.1-2.1.aarch64.rpm"
RPM_HASH = "8bf25b36117d207855af28b02df1a8b69f1e7f6e32c900e27fbb4fe16f0a78847e92381991ad28b51d5da028e7f87c4cc8d4295817836f71d8437e535d0b8e73"

RPROVIDES:${PN} += "cmake(libheif) libheif-devel libheif-devel(aarch-64) pkgconfig(libheif)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libheif1 pkgconfig(aom) pkgconfig(dav1d) pkgconfig(libsharpyuv)"

inherit rpm
