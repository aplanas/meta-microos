SUMMARY = "Development files for the Osmocom transcoding library"
DESCRIPTION = "libosmocoding is a library which provides GSM, GPRS and EDGE \
transcoding routines. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocoding."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmocoding-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "7cd190087d2091701b0142e8ec7e2e64e8cc8880faeba0acb39a58de0c921edae99ef6bd4cfe31969d592acf8bec0646b49505253576a480d5f3e311f39f4ce0"

RPROVIDES:${PN} += "libosmocoding-devel libosmocoding-devel(aarch-64) pkgconfig(libosmocoding)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocoding0 libosmocore-devel pkgconfig(libosmocodec) pkgconfig(libosmocore) pkgconfig(libosmogsm) pkgconfig(talloc)"

inherit rpm
