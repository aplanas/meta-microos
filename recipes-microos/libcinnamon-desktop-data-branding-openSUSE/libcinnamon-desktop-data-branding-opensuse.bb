SUMMARY = "openSUSE Branding of the Cinnamon Desktop Environment"
DESCRIPTION = "This package provides the openSUSE look and feel for the Cinnamon \
desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "42.2"

RPM_NAME = "libcinnamon-desktop-data-branding-openSUSE-42.2-5.17.noarch.rpm"
RPM_HASH = "918d71adcc95befe607b549f1c2efeac6a4486ea6e931936cb6ab76f3e4c1876b8cf16fe34992ac45b7bbbeee3bd8fa6329adacf5dc017b91b68bffd1bb3d803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcinnamon-desktop-data-branding libcinnamon-desktop-data-branding-openSUSE"
RDEPENDS:${PN} += "/bin/sh adwaita-icon-theme libcinnamon-desktop-data wallpaper-branding-openSUSE"

inherit rpm
