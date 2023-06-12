SUMMARY = "openSUSE Branding of xfce4-session"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Session Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.18.0+git0.9a2f754"

RPM_NAME = "xfce4-session-branding-openSUSE-4.18.0+git0.9a2f754-1.5.noarch.rpm"
RPM_HASH = "a5ecc761d4e3e86ccd1738c6f84b2436c46a95ea5ecea079a13e3190ca7a06f32a06cf5513053d930134684444b72c4fd963c7f2b59cd191114301bd40d7dea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-session-branding-openSUSE) \
xfce4-session-branding \
xfce4-session-branding-openSUSE"
RDEPENDS:${PN} += "adwaita-xfce-icon-theme \
desktop-file-utils \
gtk2-metatheme-greybird-geeko \
gtk3-metatheme-greybird-geeko \
libgio-2_0-0 \
metatheme-greybird-geeko-common \
thunar-volman"

inherit rpm
