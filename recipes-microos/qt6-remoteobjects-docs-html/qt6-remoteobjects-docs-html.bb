SUMMARY = "Documentation for qt6-remoteobjects in HTML format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c4eb9c083fa6582c82b4810afed74219be9b0a3451158958d264e172353845ce72d095cd4f710b9c93aa47cdae75c333b4115bc6afd60c8618cb6f5026ad2a2f"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-html qt6-remoteobjects-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
