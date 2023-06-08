SUMMARY = "Development files for pocketsphinx, a speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit has a number of packages for different tasks and \
applications. Pocketsphinx is a version of the open-source CMU Sphinx \
II speech recognition system which is able to recognize speech in \
real-time. \
 \
This is the development package for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "pocketsphinx-devel-0.8-5.15.aarch64.rpm"
RPM_HASH = "3854064bd87a139c872828fccf66ab3d5a59032097d6706fdbae1359e4336ad9a3e3574a5c07de95534341b3b3e7cb34e506fdb2ff591a201ac937a1b43dabc8"

RPROVIDES:${PN} += "pkgconfig(pocketsphinx) pocketsphinx-devel pocketsphinx-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpocketsphinx1 pkgconfig(sphinxbase)"

inherit rpm
