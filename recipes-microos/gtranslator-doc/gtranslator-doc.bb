SUMMARY = "Documentation for gtranslator"
DESCRIPTION = "This package contains documentation for gtranslator."
LICENSE = "GPL-3.0-or-later"

PV = "42.0"

RPM_NAME = "gtranslator-doc-42.0-1.6.aarch64.rpm"
RPM_HASH = "7d4b4a78d02534a837932914d627334d58e229ec590e3fad46b7251e89d883ad1c820ec8f13525553f71c976a6e01ea654c996f20f6a25e0ddab20d5fca9dac6"

RPROVIDES:${PN} += "gtranslator-doc gtranslator-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
