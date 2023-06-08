SUMMARY = "openSUSE branding of sway"
DESCRIPTION = "This package provides the openSUSE look and feel for sway."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "sway-branding-openSUSE-0.15.1-1.1.noarch.rpm"
RPM_HASH = "d934266f130583058a2ca271e8ef6618d197defed2228525ac8269ffd8c6a200216156806b1ef4d60a28dc3549b4dd82bd52fcf9828e87e635ac04ff52564c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(sway-branding-openSUSE) sway-branding sway-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh SwayNotificationCenter bc brightnessctl fontawesome-fonts jq pamixer patterns-sway-sway pavucontrol playerctl polkit-gnome sway wallpaper-branding-openSUSE wob"

inherit rpm
