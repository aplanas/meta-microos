SUMMARY = "A way to work around problems in WINE"
DESCRIPTION = "Winetricks is a way to work around problems in Wine. \
 \
It has a menu of supported games/apps for which it can do all the \
workarounds automatically. It also allows the installation of missing \
DLLs and tweaking of various WINE settings."
LICENSE = "LGPL-2.1-or-later"

PV = "20230212"

RPM_NAME = "winetricks-20230212-1.1.aarch64.rpm"
RPM_HASH = "d28990977aac0640ef92ab217b0de2db6959f7339c8a1a81f6c9a8c98ee0a6621f925277035deff70f89e6ca5f43bc747aa534e8ab1d3fe436c0c832be90fb6c"

RPROVIDES:${PN} += "application() application(winetricks.desktop) metainfo() metainfo(winetricks.appdata.xml) winetricks winetricks(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cabextract unzip wine"

inherit rpm
