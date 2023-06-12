SUMMARY = "Common packages for Desktops on MicroOS"
DESCRIPTION = "Packages required for openSUSE MicroOS Desktops."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-desktop-common-5.0-70.1.aarch64.rpm"
RPM_HASH = "3ba0e85b5302bb5e2c268f22b8f312cbc082f0f31dbd6a488be090f6699f10e1899913b61156f4b58bc7b993c7ce0c29490aea993ef2298e2a1bc9c5e58e0204"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-microos-desktop-common patterns-microos-desktop-common(aarch-64)"
RDEPENDS:${PN} += "OpenPrintingPPDs avahi bash-completion bluez-cups bluez-firmware bolt cups cups-filters cups-pk-helper ghostscript glibc-locale gstreamer-plugin-pipewire gzip hicolor-icon-theme-branding-openSUSE hostname hplip-hpijs kernel-firmware-all ntfs-3g ntfsprogs pattern() pipewire-alsa pipewire-pulseaudio policycoreutils-python-utils polkit-default-privs sof-firmware system-config-printer-common system-config-printer-dbus-service systemd-icon-branding-openSUSE transactional-update-notifier udev-configure-printer udisks2 unzip upower wget xdg-desktop-portal-gtk xdg-utils"

inherit rpm
