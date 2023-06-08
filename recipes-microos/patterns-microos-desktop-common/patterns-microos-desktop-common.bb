SUMMARY = "Common packages for Desktops on MicroOS"
DESCRIPTION = "Packages required for openSUSE MicroOS Desktops."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-common-5.0-69.1.aarch64.rpm"
RPM_HASH = "881f26d3f37871c9b3b924e41d420e033455ca0689f91e2b1d359712fe36ddd4aabe84c5f1564f0ca20ced2a9fdfd54936e5a2de75c496cfb1a26631593b7595"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-microos-desktop-common patterns-microos-desktop-common(aarch-64)"
RDEPENDS:${PN} += "OpenPrintingPPDs avahi bash-completion bluez-cups bluez-firmware bolt cups cups-filters cups-pk-helper ghostscript glibc-locale gstreamer-plugin-pipewire gzip hicolor-icon-theme-branding-openSUSE hostname hplip-hpijs kernel-firmware-all ntfs-3g ntfsprogs pattern() pipewire-alsa pipewire-pulseaudio policycoreutils-python-utils polkit-default-privs sof-firmware system-config-printer-common system-config-printer-dbus-service systemd-icon-branding-openSUSE transactional-update-notifier udev-configure-printer udisks2 unzip upower wget xdg-desktop-portal-gtk xdg-utils"

inherit rpm
