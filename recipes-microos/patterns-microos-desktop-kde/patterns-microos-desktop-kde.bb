SUMMARY = "MicroOS KDE Plasma Desktop"
DESCRIPTION = "Packages required for the openSUSE MicroOS with KDE Plasma"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-kde-5.0-69.1.aarch64.rpm"
RPM_HASH = "d29a13ecf62ddfc1efd01d3ff2fdf132989d90539899487ea79d62a329e81bc70cf1e704de2bb6f09744c8dda9df7bee435a090494b9588118356125d927e67c"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-desktop-kde patterns-microos-desktop-kde(aarch-64)"
RDEPENDS:${PN} += "(gtk2-metatheme-breeze if gtk2) (gtk3-metatheme-breeze if gtk3) (gtk4-metatheme-breeze if gtk4) (power-profiles-daemon or tlp) NetworkManager-openvpn baloo5-file bluedevil5 breeze5-wallpapers discover-backend-flatpak discover-backend-fwupd discover-notifier dolphin ffmpegthumbs google-noto-coloremoji-fonts google-noto-sans-cjk-fonts kate kcm_flatpak kcm_sddm kde-gtk-config5 kde-gtk-config5-gtk3 kde-print-manager kdegraphics-thumbnailers kdenetwork-filesharing kgamma5 kio-extras5 kio-fuse konsole kwalletmanager5 kwrited5 libqt5-qtimageformats noto-sans-math-fonts openvpn-auth-pam-plugin oxygen5-sounds pattern() phonon4qt5-backend-gstreamer pinentry-qt5 plasma-branding-MicroOS plasma-browser-integration plasma-nm5 plasma-nm5-openconnect plasma-nm5-openvpn plasma5-addons plasma5-defaults-openSUSE plasma5-desktop-emojier plasma5-pa plasma5-session-wayland plasma5-systemmonitor purpose qqc2-desktop-style sddm sddm-theme-openSUSE spectacle xdg-desktop-portal-kde"

inherit rpm
