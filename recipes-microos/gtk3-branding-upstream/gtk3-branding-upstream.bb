SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the upstream theme configuration for widgets and \
icon themes."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-branding-upstream-3.24.37+70-1.1.noarch.rpm"
RPM_HASH = "d79d122571959dc83161fa4b747b0709add26753cff9693f43d7b284d2d1845c52481c874afcee2ab32d31fe68ad127b57d65b2da799310be45a56643b11beec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gtk3-branding-upstream) gtk3-branding gtk3-branding-upstream"
RDEPENDS:${PN} += "libgtk-3-0"

inherit rpm
