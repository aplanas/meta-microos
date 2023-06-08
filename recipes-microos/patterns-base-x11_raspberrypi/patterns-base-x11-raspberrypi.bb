SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-x11_raspberrypi-20200505-40.1.aarch64.rpm"
RPM_HASH = "5819f3d11bcaabde656d7e62c04ee7e3f95aa48a7fa35d346ea0521bcc3d53540c569f3ad2d1231d2ca5a0c431338eb1c6f5b4a8880cfc4c1f37161cdfca444b"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-x11_raspberrypi patterns-base-x11_raspberrypi(aarch-64)"
RDEPENDS:${PN} += "gconf2 gtk2-metatheme-adwaita gtk3-metatheme-adwaita icewm icewm-default icewm-lite icewm-theme-branding libyui-ncurses-pkg libyui-qt-pkg mutt mutt-lang pattern() polkit-default-privs polkit-gnome-lang x11-tools x11perf xauth xbacklight xclock xconsole xcursor-themes xcursorgen xdg-user-dirs xdg-user-dirs-gtk xdg-user-dirs-gtk-lang xdg-utils xdm xdmbgrd xdpyinfo xev xeyes xf86-input-evdev xf86-input-libinput xf86-video-fbdev xfd xfontsel xgamma xhost xinit xinput xkbcomp xkbevd xkbprint xkbutils xkeyboard-config xkill xlogo xlsatoms xlsclients xlsfonts xmag xmessage xmodmap xorg-x11 xorg-x11-fonts-core xorg-x11-server xorg-x11-server-extra xprop xrandr xrdb xrestop xscope xscreensaver xscreensaver-data xset xsetmode xsetpointer xsetroot xterm xtermset xvinfo xwd xwininfo yast2-control-center-qt yast2-packager yast2-snapper yast2-x11"

inherit rpm
