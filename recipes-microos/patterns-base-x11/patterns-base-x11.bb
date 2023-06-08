SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11-20200505-40.1.aarch64.rpm"
RPM_HASH = "b3364f585ff844cda631290172e7256fd9720d0308177326fcae53d185b6016b2c473c8284577ea0d325c892da2df830071bdbf4131fff758716ce7bcf6316cf"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-x11 patterns-base-x11(aarch-64) patterns-openSUSE-x11"
RDEPENDS:${PN} += "pattern() xf86-input-libinput xorg-x11-fonts-core xorg-x11-server"

inherit rpm
