SUMMARY = "Zoom in/out of windows (toggle between one window and multi-window)"
DESCRIPTION = "The idea is to make it easy to zoom into and out of a window. \
Usage: \
 \
     Press <c-w>o : the current window zooms into a full screen \
     Press <c-w>o again: the previous set of windows is restored"
LICENSE = "Vim"

PV = "24"

RPM_NAME = "vim-plugin-zoomwin-24-55.1.noarch.rpm"
RPM_HASH = "d8974cf313cf06918037d6f2147958c75c525a469bb4e2a7b39777dd17186f0f41aced84c51881510c9d1cc152c25b5ae3154f0a806f2b44cff4c949b9b23e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-zoomwin"
RDEPENDS:${PN} += "/bin/sh \
vim"

inherit rpm
