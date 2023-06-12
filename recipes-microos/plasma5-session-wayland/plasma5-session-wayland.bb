SUMMARY = "KDE Plasma 5 Wayland Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 5 session with Wayland from a display manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-session-wayland-5.27.5-2.4.aarch64.rpm"
RPM_HASH = "60310018503baed15e15640ac295704ed75403702ecf6fde79efa77d651769f76e6f27a05edb92c488591e70ef107af2168353a16878c8a954998c5857ec547b"

RPROVIDES:${PN} += "plasma5-session-wayland plasma5-session-wayland(aarch-64)"
RDEPENDS:${PN} += "kwayland-integration libqt5-qtwayland pipewire plasma5-session xf86-input-libinput xorg-x11-server-wayland"

inherit rpm
