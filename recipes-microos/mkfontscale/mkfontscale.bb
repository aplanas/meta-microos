SUMMARY = "Utility to create index of scalable font files for X"
DESCRIPTION = "mkfontscale creates the fonts.scale and fonts.dir index files used by the \
legacy X11 font system."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "mkfontscale-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "e83f76a2716bf14c21fdda6d576bd968294443fc17c40c2f4a71f155b8e0ff1afb46ca67396fc784a33c682045d277bdddc833a08167fbaf59341bd37c580bf0"

RPROVIDES:${PN} += "mkfontdir mkfontscale mkfontscale(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontenc.so.1()(64bit) libfreetype.so.6()(64bit) libz.so.1()(64bit)"

inherit rpm
