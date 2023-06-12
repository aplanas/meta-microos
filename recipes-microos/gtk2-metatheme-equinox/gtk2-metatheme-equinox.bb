SUMMARY = "Equinox Metathemes for GTK+"
DESCRIPTION = "This package provides a set of elegant GTK+ themes that use the Equinox \
engine."
LICENSE = "GPL-2.0+"

PV = "1.50"

RPM_NAME = "gtk2-metatheme-equinox-1.50-10.28.aarch64.rpm"
RPM_HASH = "3ca3f31f38210cc532f8055ec599b4d167c34b93c337d10b96c79b67188bcc7c6c0a3cef3d2e291ffc6f28cb54663c40ef530c8d9f2e105e863dd86fb5f3768a"

RPROVIDES:${PN} += "gtk2-metatheme-equinox \
gtk2-metatheme-equinox(aarch-64)"
RDEPENDS:${PN} += "dmz-icon-theme-cursors \
faenza-icon-theme \
gtk2-engine-equinox"

inherit rpm
