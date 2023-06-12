SUMMARY = "YaST2 - Control Center"
DESCRIPTION = "This package contains the menu selection component for YaST2."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-control-center-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "b21f59149e02ee33e9fb2330b43f2c86d47ad7c273af2dced179d902e8c0fb4bed803d53d91fe25657bb2fa6888a10f0d5d4fadb341c1d776b2379f0af37fff1"

RPROVIDES:${PN} += "application() \
application(org.opensuse.YaST.desktop) \
metainfo() \
metainfo(org.opensuse.YaST.appdata.xml) \
yast2-control-center \
yast2-control-center(aarch-64) \
yast2-control-center-gnome"
RDEPENDS:${PN} += "yast2 \
yast2-control-center-binary"

inherit rpm
