SUMMARY = "Search engine for music related metadata"
DESCRIPTION = "This subpackage contains the Glyr CLI tool. \
 \
The sort of metadata glyr is searching (and downloading) is usually the \
data you see in your music player. It was originally written \
to serve as internal library for a music player, but has been extended \
to work as a standalone program which is able to download: \
 \
* cover art; \
* lyrics; \
* bandphotos; \
* artist biography; \
* album reviews; \
* tracklists of an album; \
* a list of albums from a specific artist; \
* tags, either related to artist, album or title relations, for example \
  links to Wikipedia; \
* similar artists; \
* similar songs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "glyrc-1.0.10-3.9.aarch64.rpm"
RPM_HASH = "3cfbec80487b47a63dd69a39c94d118c477421120803e79374ba81d46c84bb68dcbbbece43663a6d5ffc42cdec50e34b0b3f8b423a8377914bddad2f6865b9c1"

RPROVIDES:${PN} += "glyr \
glyrc \
glyrc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libglyr.so.1()(64bit)"

inherit rpm
