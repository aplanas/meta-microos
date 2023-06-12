SUMMARY = "Upstream theme configuration for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-branding-upstream-2.24.33-4.3.noarch.rpm"
RPM_HASH = "c4a43e635ae93f38df84a74007504861b6dffafc3595d3be560d1828175416d9f6c8d712adfa4e6372e8d56b17ac54077fce301ad0224496eda3424d3fdf84ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gtk2-branding-upstream) \
gtk2-branding \
gtk2-branding-upstream"
RDEPENDS:${PN} += "libgtk-2_0-0"

inherit rpm
