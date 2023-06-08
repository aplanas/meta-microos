SUMMARY = "KDE Plasma 5 Wayland Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with Wayland from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4.1"

RPM_NAME = "plasma5-session-wayland-5.27.4.1-2.2.aarch64.rpm"
RPM_HASH = "d9bd74f8eb1233c372402c4204584eeb65add9dde54b90bb5b6317135725be2eb6059bad89114116aa9f4f9b622e53684ab4777e0b05c873bd57c5a834cb145b"

RPROVIDES:${PN} += "plasma5-session-wayland plasma5-session-wayland(aarch-64)"
RDEPENDS:${PN} += "kwayland-integration libqt5-qtwayland pipewire plasma5-session xf86-input-libinput xorg-x11-server-wayland"

inherit rpm
