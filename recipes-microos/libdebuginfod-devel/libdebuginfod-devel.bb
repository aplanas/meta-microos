SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-devel-0.189-3.1.aarch64.rpm"
RPM_HASH = "0353035ad51b4f9e7d71a7e22ab1702163b4539c20b5f660a0eeddc16b8c8ae4f7ee121428477e8cb05664ac9ff91cbdd7f58699a6171774beba1041f1940c14"

RPROVIDES:${PN} += "libdebuginfod-devel libdebuginfod-devel(aarch-64) pkgconfig(libdebuginfod)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdebuginfod1"

inherit rpm
