SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides the upstream theme configuration for widgets and \
icon themes."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.3"

RPM_NAME = "gtk4-branding-upstream-4.10.3-4.1.noarch.rpm"
RPM_HASH = "abafda3efd16bde66a2ab3c23801bee45b0d7c90a9b4f41e6517670715b2ac66f8d01146c3de1c655c2d024dac90d5c29dbd91c15a31dbdf1d310da706586fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-branding \
gtk4-branding-upstream"
RDEPENDS:${PN} += "libgtk-4-1"

inherit rpm
