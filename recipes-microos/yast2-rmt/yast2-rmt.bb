SUMMARY = "YaST2 - Module to configure RMT"
DESCRIPTION = "Provides the YaST module to configure the Repository Mirroring Tool (RMT) Server."
LICENSE = "GPL-2.0-only"

PV = "1.3.4"

RPM_NAME = "yast2-rmt-1.3.4-1.4.aarch64.rpm"
RPM_HASH = "be4f7c593112d474e66348024b9932d4c7994a2f0a81a6c1ed166e77553fdffec025e4bb09e69f3defca4626351c690c3ac34379357fbcc7257fb40e2053e3af"

RPROVIDES:${PN} += "application() application(rmt.desktop) yast2-rmt yast2-rmt(aarch-64)"
RDEPENDS:${PN} += "rmt-server yast2 yast2-ruby-bindings"

inherit rpm
