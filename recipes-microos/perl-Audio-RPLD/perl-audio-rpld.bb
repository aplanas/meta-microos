SUMMARY = "Module to control the RoarAudio PlayList Daemon (rpld)"
DESCRIPTION = "Audio::RPLD is a Perl module to access the RoarAudio PlayList Daemon from \
within any Perl application. \
It supports most commands supported by the rpld. \
This included commands to control playback, the Main Queue, playlists \
and pointer mangement."
LICENSE = "GPL-3.0"

PV = "0.007_0.1beta6"

RPM_NAME = "perl-Audio-RPLD-0.007_0.1beta6-1.23.noarch.rpm"
RPM_HASH = "b8ade265f2d34611a5502964bf73dce20b3edce0e20cfd90a6ca1c6992249fa093f57742423beb6538baf6ba246a19adea27516c2b2fdf59135a56f64a9c7fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Audio::RPLD) perl-Audio-RPLD"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
