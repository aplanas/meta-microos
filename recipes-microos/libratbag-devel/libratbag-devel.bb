SUMMARY = "Development files for the libratbag game mouse config library"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the files needed to build programs with \
libratbag."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "libratbag-devel-0.17-1.3.aarch64.rpm"
RPM_HASH = "0057f7eb54998ee02440cf3a1761ff16bc325b0cdb954a5a5b6cf7e6bd34394e38256dbfdbe38c8fb23ca74f0dd623bf217ea082c4c84971fa38f3250009aa61"

RPROVIDES:${PN} += "libratbag-devel libratbag-devel(aarch-64) pkgconfig(liblur)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblur3"

inherit rpm
