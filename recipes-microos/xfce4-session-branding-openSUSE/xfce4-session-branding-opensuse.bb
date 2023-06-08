SUMMARY = "openSUSE Branding of xfce4-session"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Session Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-session-branding-openSUSE-4.18.0+git0.9a2f754-1.2.noarch.rpm"
RPM_HASH = "a2ee45b5e5e06d5cfe89fe21ea6b6e9e8208acab2e93f4de6738d15028a40f7b214853945e27b9a7f69eaec010d3b7feaf988629d5500a93720dbd667d229f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-session-branding-openSUSE) xfce4-session-branding xfce4-session-branding-openSUSE"
RDEPENDS:${PN} += "adwaita-xfce-icon-theme desktop-file-utils gtk2-metatheme-greybird-geeko gtk3-metatheme-greybird-geeko libgio-2_0-0 metatheme-greybird-geeko-common thunar-volman"

inherit rpm
