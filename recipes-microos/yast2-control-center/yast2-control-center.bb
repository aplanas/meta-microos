SUMMARY = "YaST2 - Control Center"
DESCRIPTION = "This package contains the menu selection component for YaST2."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-control-center-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "e66999f5b559bd07cef831010ce35858e64c297295727baa39500e9d8f9bcc0998f4c8394a4ff53b47c91a93994cbb1afa6b09c52521323cd2914bb237ce71d8"

RPROVIDES:${PN} += "application() application(org.opensuse.YaST.desktop) metainfo() metainfo(org.opensuse.YaST.appdata.xml) yast2-control-center yast2-control-center(aarch-64) yast2-control-center-gnome"
RDEPENDS:${PN} += "yast2 yast2-control-center-binary"

inherit rpm
