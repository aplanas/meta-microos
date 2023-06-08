SUMMARY = "openSUSE definitions of default settings and applications"
DESCRIPTION = "This package provides openSUSE defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "BSD-3-Clause"

PV = "42.1"

RPM_NAME = "gio-branding-openSUSE-42.1-20.2.noarch.rpm"
RPM_HASH = "f80a0339c8d00ea1be6f802ff836b1bfc909a38c75ad84fa14429df937851195f8e5c8de0ac69437497902d0c18b5df34bb59df079747f92ae92480c3806cbb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gio-branding-openSUSE) gio-branding gio-branding-openSUSE glib2-branding-openSUSE"
RDEPENDS:${PN} += "libgio-2_0-0"

inherit rpm
