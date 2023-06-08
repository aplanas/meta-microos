SUMMARY = "Data files for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.37+70"

RPM_NAME = "gtk3-data-3.24.37+70-1.1.noarch.rpm"
RPM_HASH = "4018e41f624ac23787053ab0f1a55fec676ad649653dc71e1d5b212a0becff4371651771d02c13896ba8721808e4419f4365bb3546a4bc3cdf7256528e655635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-data"
RDEPENDS:${PN} += ""

inherit rpm
