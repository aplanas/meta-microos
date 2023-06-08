SUMMARY = "Upstream Branding for xfce4-panel"
DESCRIPTION = "This package provides the upstream look and feel for xfce4-panel."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.3"

RPM_NAME = "xfce4-panel-branding-upstream-4.18.3-1.1.noarch.rpm"
RPM_HASH = "696330084af8088e1cc29eb227de3dd2c76c5b44339e46d7d079232924cac10974a584a70dea6f62d1c71193274a947609a08d89bf3e047d7087071ede3cbd13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xfce4-panel-branding-upstream) xfce4-panel-branding xfce4-panel-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm
