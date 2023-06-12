SUMMARY = "openSUSE branded KDE settings"
DESCRIPTION = "This package does not contain anything by itself, but pulls in \
default settings and extensions for the standard openSUSE \
desktop."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-workspace-branding-openSUSE-84.87~git20230131T131056~433af24-7.1.noarch.rpm"
RPM_HASH = "e0b59549d12c2de754bd04af16a24bd32a7296617a5bf1750e162c9bce230fe20439e3baf244fcb996476f5f7e9cef6b30da4b9c462eae533a5ce63489a66614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-branding plasma5-workspace-branding-openSUSE"
RDEPENDS:${PN} += "plasma5-defaults-openSUSE plasma5-workspace wallpaper-branding-openSUSE"

inherit rpm
