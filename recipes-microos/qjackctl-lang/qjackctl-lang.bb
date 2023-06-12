SUMMARY = "Translations for package qjackctl"
DESCRIPTION = "Provides translations for the 'qjackctl' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "qjackctl-lang-0.9.10-1.1.noarch.rpm"
RPM_HASH = "8194820a686c624a7f1610faa4a4f24fa9fddf9d560b17a41a5ad971a56513214bd392011bd8f43cb5916a43b53c0b15c2ee7402c84d96eadc861d649283ec70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qjackctl-lang \
qjackctl-lang-all"
RDEPENDS:${PN} += "qjackctl"

inherit rpm
