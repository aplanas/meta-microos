SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_enhanced-20200505-41.1.aarch64.rpm"
RPM_HASH = "134b623f88a0e9cf185a9a6eb116eee06f5e437144976828bab6dceef048451371f5049a1989fbadf675cc4a7e261d91052f716712e2a98462c0051076fd9dca"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-base-x11_enhanced \
patterns-base-x11_enhanced(aarch-64)"
RDEPENDS:${PN} += "glibc-locale \
glibc-locale-base \
pattern() \
xkeyboard-config \
xorg-x11-essentials"

inherit rpm
