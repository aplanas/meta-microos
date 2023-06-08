SUMMARY = "Library That Provides Access to the MusicBrainz Server"
DESCRIPTION = "MusicBrainz is the second generation incarnation of the CD Index. This \
server is designed to enable audio CD, MP3 and Vorbis players to \
download metadata about the music they are playing."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libmusicbrainz-devel-5.1.0-1.8.aarch64.rpm"
RPM_HASH = "cb48b0238dbfddfcf1da75c9e9a0aff5a9ff93ae37b85023ea8348012714bc616c0344a0e0531bd4afd556ce1c1f4b00965b56e0b4fdc03ec523ba6c5e0db63f"

RPROVIDES:${PN} += "libmusicbrainz-devel libmusicbrainz-devel(aarch-64) libmusicbrainz5-devel pkgconfig(libmusicbrainz5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmusicbrainz5-1 libstdc++-devel pkgconfig(libxml-2.0) pkgconfig(neon)"

inherit rpm
