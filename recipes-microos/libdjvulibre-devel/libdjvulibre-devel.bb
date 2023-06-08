SUMMARY = "Headers for djvulibre libraries"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "libdjvulibre-devel-3.5.28-4.6.aarch64.rpm"
RPM_HASH = "11294a3cd380015da40755fbb346926e6c8970fb0cc832ce03b204a95a4f43357715135a49e055eb76ae9d75f39e7820a1ae7be9731d1702ba2e2eb6ca5cefc7"

RPROVIDES:${PN} += "libdjvulibre-devel libdjvulibre-devel(aarch-64) pkgconfig(ddjvuapi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdjvulibre21"

inherit rpm
