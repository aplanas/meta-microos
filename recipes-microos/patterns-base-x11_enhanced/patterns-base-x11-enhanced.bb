SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_enhanced-20200505-40.1.aarch64.rpm"
RPM_HASH = "9e4e896c2245fe938147e998f05b1ef9fc3c0154fbfe392f7881a606da0e69fe880bc31c7c391eb99dd859e51eea26f4d5d89a360cef204ddfce0568ac3e09d7"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-base-x11_enhanced patterns-base-x11_enhanced(aarch-64)"
RDEPENDS:${PN} += "glibc-locale glibc-locale-base pattern() xkeyboard-config xorg-x11-essentials"

inherit rpm
