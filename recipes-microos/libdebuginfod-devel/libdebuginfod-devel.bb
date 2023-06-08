SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-devel-0.189-2.3.aarch64.rpm"
RPM_HASH = "d210041b61c1880e05db667bc703abd723da5b3115dc9d52a53507ac12106cd9f7c3fff1da221e440d90518d890964176ae789e58257ea49dbbdfb398243b7b6"

RPROVIDES:${PN} += "libdebuginfod-devel libdebuginfod-devel(aarch-64) pkgconfig(libdebuginfod)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdebuginfod1"

inherit rpm
