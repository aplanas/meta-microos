SUMMARY = "Ayatana Humanity icon theme"
DESCRIPTION = "Humanity and Humanity Dark are nice and well polished icon themes for the Gtk \
desktop."
LICENSE = "GPL-2.0-only"

PV = "0.6.16"

RPM_NAME = "humanity-icon-theme-0.6.16-1.2.noarch.rpm"
RPM_HASH = "1afaf2575cda0b7e3fd6eb1145617e2e0df0fa15917e0bc6b69789297cad5c9158149f8a6c123fae21ab5e2926c45ebb5d689331adce268003a3fcf4ca6e47d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "humanity-icon-theme"
RDEPENDS:${PN} += "adwaita-icon-theme hicolor-icon-theme"

inherit rpm
