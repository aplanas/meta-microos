SUMMARY = "Keyboard icons for kf5-kcm-fcitx"
DESCRIPTION = "This package provides systemsettings5 icons for fcitx in plasma5-workspace."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.6"

RPM_NAME = "kf5-kcm-fcitx-icons-0.5.6-3.13.noarch.rpm"
RPM_HASH = "07efaceba947ddd26b325f70819535f7ee4ee04631bd6fab8ae626e02d596c29d3d73aeedd46d35ef1557669331f84128397be127475ab2017d1a2c05a8590d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-config-kde5-icons fcitx-kcm-icons kf5-kcm-fcitx-icons"
RDEPENDS:${PN} += "kf5-kcm-fcitx"

inherit rpm
