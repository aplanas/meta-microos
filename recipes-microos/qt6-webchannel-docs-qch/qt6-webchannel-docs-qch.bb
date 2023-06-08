SUMMARY = "Documentation for qt6-webchannel in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webchannel in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-webchannel-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9c2e5bad2c80e9bcfa24a5aa81b27e61488a23f533de9445fd779cc308764f847168635e262189718b029dc0137345ae6a5bdac47a93be459cb9a4a0a886aaf1"

RPROVIDES:${PN} += "qt6-webchannel-docs-qch qt6-webchannel-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
