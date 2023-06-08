SUMMARY = "A complete, multi-colored suite of icons for Linux"
DESCRIPTION = "The GNOME-Colors is a project that aims to make the GNOME desktop as \
elegant, consistent and colorful as possible. \
 \
The current goal is to allow full color customization of themes, icons, \
GDM logins and splash screens. There are already five full \
color-schemes available; Brave (Blue), Human (Orange), Wine (Red), \
Noble (Purple) and Wise (Green). \
 \
GNOME-Colors is mostly inspired/based on Tango, GNOME, Elementary, \
Tango-Generator and many other open-source projects."
LICENSE = "GPL-2.0+"

PV = "5.5.1"

RPM_NAME = "gnome-colors-icon-theme-5.5.1-18.16.noarch.rpm"
RPM_HASH = "a9790d8371dacf84fed69b284721459ff66ac04c1017c5c864a48a9d421fcd5b0053defd8be791385cf76e3c1970c94187459f572b77d2b9189844a244a5a925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-colors-icon-theme"
RDEPENDS:${PN} += "/bin/sh gnome-icon-theme"

inherit rpm
