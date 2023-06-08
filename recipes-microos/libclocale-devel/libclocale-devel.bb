SUMMARY = "Development files for libclocale, a C locale library"
DESCRIPTION = "A library for C locale functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libclocale."
LICENSE = "LGPL-3.0-or-later"

PV = "20221218"

RPM_NAME = "libclocale-devel-20221218-1.2.aarch64.rpm"
RPM_HASH = "e9bb5255e6e6b36e64dd0ea32caa5bbb89736ca421c1a7cb9150ea08080a689bebe255d6807ef39705acbe6dccf8972879e3ca74faf2eab1fe0c6813809b5c75"

RPROVIDES:${PN} += "libclocale-devel libclocale-devel(aarch-64) pkgconfig(libclocale)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libclocale1"

inherit rpm
