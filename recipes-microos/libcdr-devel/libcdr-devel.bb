SUMMARY = "Files for Developing with libcdr"
DESCRIPTION = "libcdr is a library for parsing the Corel Draw file format structure. \
 \
This package contains the libcdr development files."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-devel-0.1.7-1.18.aarch64.rpm"
RPM_HASH = "652eb0d7c632491b44394b71f5cbd5e5fe043ff067729313e17bf577bdeb830308da24e6806c6d34cd8bef99be39fa45a0825b812c16cb533a8bba06fceba69c"

RPROVIDES:${PN} += "libcdr-devel libcdr-devel(aarch-64) pkgconfig(libcdr-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcdr-0_1-1 pkgconfig(icu-i18n) pkgconfig(lcms2) pkgconfig(librevenge-0.0) pkgconfig(zlib)"

inherit rpm
