SUMMARY = "YaST2 - Manage Update-alternatives switching"
DESCRIPTION = "A YaST2 module to manage update alternatives switching"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-alternatives-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "632bc607374004746de07d4a247f425e76491e252175e39bfeeb2a061d0c33b98ca1a80f4199b97cd79aec1ca727fffed08fb58231b3f55a56b6a921dad0c24c"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Alternatives.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Alternatives.metainfo.xml) \
yast2-alternatives \
yast2-alternatives(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
