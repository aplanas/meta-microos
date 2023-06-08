SUMMARY = "Upstream branding of elementary-wallpapers"
DESCRIPTION = "This package provides the default wallpaper in Elementary OS."
LICENSE = "CC-BY-NC-SA-2.0"

PV = "5.5.0"

RPM_NAME = "pantheon-wallpapers-branding-upstream-5.5.0-1.10.noarch.rpm"
RPM_HASH = "d9f576fc220b3e5e5ae46406203051dd69ffb99888b4a953cb9f43b0e44d4d187caf5dbb4e8f7ca89d647697244a4dcbca86bbd850846d135055d5f4a6dc8f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pantheon-wallpapers-branding pantheon-wallpapers-branding-upstream"
RDEPENDS:${PN} += "elementary-wallpapers"

inherit rpm
