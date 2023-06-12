SUMMARY = "VLC bindings for python"
DESCRIPTION = "VLC bindings for python. \
 \
This module provides ctypes-based bindings for the native libvlc API \
(see http://wiki.videolan.org/LibVLC) of the VLC video player."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.18122"

RPM_NAME = "python311-python-vlc-3.0.18122-1.1.noarch.rpm"
RPM_HASH = "daf6f658e0fd06ca02996cde98eba035d12abb30276b0b2bfb5926246a9cd6d6e8520bf14edbb9daecf6523a898156bdf2356298830e8529ab85970dc1437c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-vlc) \
python311-python-vlc \
python3dist(python-vlc)"
RDEPENDS:${PN} += "libvlc5 \
python(abi)"

inherit rpm
