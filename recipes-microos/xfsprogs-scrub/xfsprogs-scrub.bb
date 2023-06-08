SUMMARY = "XFS scrubbing scripts and service files"
DESCRIPTION = "Scripts and systemd service files for background scrubbing of metadata \
on xfs filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "xfsprogs-scrub-6.2.0-1.1.aarch64.rpm"
RPM_HASH = "e6c4b32a60506314329144bf644174679db7ac2221d3a98c8ef6e0ac260f504f83d563722b24288ed8c4ed445bd11c44a543e8ecaef495e6a21917619895db99"

RPROVIDES:${PN} += "xfsprogs-scrub xfsprogs-scrub(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 xfsprogs"

inherit rpm
