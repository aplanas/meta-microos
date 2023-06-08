SUMMARY = "openSUSE branded KDE settings"
DESCRIPTION = "This package does not contain anything by itself, but pulls in \
default settings and extensions for the standard openSUSE \
desktop."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-workspace-branding-openSUSE-84.87~git20230131T131056~433af24-6.1.noarch.rpm"
RPM_HASH = "2d5e5b22d0c81768880fa1d50b639f7bf83e815472f6caf1ff6dc3512587b8176fe7d9d1505953059a6046aa9d40b017d6b5c917faa6b1c2ab207ed9170c4462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-branding plasma5-workspace-branding-openSUSE"
RDEPENDS:${PN} += "plasma5-defaults-openSUSE plasma5-workspace wallpaper-branding-openSUSE"

inherit rpm
