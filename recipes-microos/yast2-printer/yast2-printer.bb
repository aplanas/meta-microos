SUMMARY = "YaST2 - Printer Configuration"
DESCRIPTION = "This package contains the YaST2 component for printer configuration."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-printer-4.6.0-1.2.aarch64.rpm"
RPM_HASH = "dd605f18687818460c80ddc8171ea20e5d9b0b86fd96f5169f8e21ac62acf7212a295dde72ffb288f875ea5241358a459ccbd27b196a7757cd70183e8a66dd8d"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.Printer.desktop) metainfo() metainfo(org.opensuse.yast.Printer.metainfo.xml) yast2-printer yast2-printer(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/mktemp /usr/bin/sed yast2 yast2-ruby-bindings"

inherit rpm
