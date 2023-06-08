SUMMARY = "Plymouth label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using pango and cairo."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "2eb78cd8997d9989f22d3902ea55295a850290b697bf75b00e910756c937c93b83822c91129dc4ef3a2ba104e35bdda9f4b0355339c44a357cdb9201704b3902"

RPROVIDES:${PN} += "plymouth-plugin-label plymouth-plugin-label(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgobject-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libply-splash-core.so.5()(64bit) libply-splash-graphics5"

inherit rpm
