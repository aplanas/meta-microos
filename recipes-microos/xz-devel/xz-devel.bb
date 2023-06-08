SUMMARY = "Development package for the LZMA library"
DESCRIPTION = "This package contains the header files and libraries needed for \
compiling programs using the LZMA library."
LICENSE = "SUSE-Public-Domain"

PV = "5.4.3"

RPM_NAME = "xz-devel-5.4.3-1.1.aarch64.rpm"
RPM_HASH = "a8ccf1b41196ac528fbf1b56d3e648fa2148b3766164738fcfe19df39c0df29fc2f2906ad1b999176c9bc5e07ec61cbc91ff097507ddef9bceca4be354934bc0"

RPROVIDES:${PN} += "lzma-alpha-devel lzma-devel pkgconfig(liblzma) xz-devel xz-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblzma5"

inherit rpm
