SUMMARY = "Dracula Xfwm4 themes"
DESCRIPTION = "This package contains the Xfwm4 support for for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "xfwm4-theme-dracula-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "3ef06363117102ddd66a53031cfd1766ac382b908bcb8a28f841b194c77a7f43004cd1facf074d85bf65e352044110874962a015b96210b29c78be65d074a976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme xfwm4-theme-dracula"
RDEPENDS:${PN} += "metatheme-dracula-common xfwm4"

inherit rpm
