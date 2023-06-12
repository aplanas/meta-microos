SUMMARY = "Documentation for qt6-webchannel in HTML format"
DESCRIPTION = "This package contains documentation for qt6-webchannel in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webchannel-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8834aff1c7e58a0438cd99f87635fc71bc683f9a263323b34c9777b140047aa68ffcca36a4b111250b861be3bc384fefd58f5134dbe9a712b9deb3b916668d5d"

RPROVIDES:${PN} += "qt6-webchannel-docs-html qt6-webchannel-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
