SUMMARY = "openSUSE branding of lightdm-gtk-greeter"
DESCRIPTION = "This package provides the openSUSE look and feel for lightdm-gtk-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "lightdm-gtk-greeter-branding-openSUSE-2.0-4.2.noarch.rpm"
RPM_HASH = "14806ea4be270bab9f6307e01409a08569806bf3f8ea890a54fcf35134d5e65f5fc32f7e456a738f9d86fb8d1920b668065ae9977878bcc8ebc6d5a24eb65207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(lightdm-gtk-greeter-branding-openSUSE) lightdm-gtk-greeter-branding lightdm-gtk-greeter-branding-openSUSE"
RDEPENDS:${PN} += "gtk3-metatheme-greybird-geeko lightdm-gtk-greeter wallpaper-branding"

inherit rpm
