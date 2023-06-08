SUMMARY = "VLC bindings for python"
DESCRIPTION = "VLC bindings for python. \
 \
This module provides ctypes-based bindings for the native libvlc API \
(see http://wiki.videolan.org/LibVLC) of the VLC video player."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.18122"

RPM_NAME = "python39-python-vlc-3.0.18122-1.1.noarch.rpm"
RPM_HASH = "0355d2d271b185e863af97b0f7bcb5814e9e344c630111fba86fe4a56cfe9e0cbab3d8993355d9bff684f28ada1846fca430d69147764be88dd84e7f3dc49f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-vlc) python39-python-vlc python3dist(python-vlc)"
RDEPENDS:${PN} += "libvlc5 python(abi)"

inherit rpm
