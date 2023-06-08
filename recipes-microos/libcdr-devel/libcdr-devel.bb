SUMMARY = "Files for Developing with libcdr"
DESCRIPTION = "libcdr is a library for parsing the Corel Draw file format structure. \
 \
This package contains the libcdr development files."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-devel-0.1.7-1.17.aarch64.rpm"
RPM_HASH = "c9e4ac76cfd6f7709f84e0e88def31027bf87f23b47619eab9b59152132811b86a97d233f6cb46752bb699258c80177faaf8998ed303fd8c1644c5e2b9423e10"

RPROVIDES:${PN} += "libcdr-devel libcdr-devel(aarch-64) pkgconfig(libcdr-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcdr-0_1-1 pkgconfig(icu-i18n) pkgconfig(lcms2) pkgconfig(librevenge-0.0) pkgconfig(zlib)"

inherit rpm
