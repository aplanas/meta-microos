SUMMARY = "The GTK+ toolkit library (version 3) -- openSUSE theme configuration"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the openSUSE theme configuration for \
widgets and icon themes."
LICENSE = "BSD-3-Clause"

PV = "15.0"

RPM_NAME = "gtk3-branding-openSUSE-15.0-1.45.noarch.rpm"
RPM_HASH = "d97469bc01326724ff0070f458ddf1f2941c2bd8147f2e6531f057cd9e3fac31c51ac032b24ebae2c0ef067891d1c6656921d368ccb4806a24b3e7c26e171586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gtk3-branding-openSUSE) gtk3-branding gtk3-branding-openSUSE"
RDEPENDS:${PN} += "gtk3-metatheme-adwaita libgtk-3-0"

inherit rpm
