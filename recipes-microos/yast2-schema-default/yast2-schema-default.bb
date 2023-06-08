SUMMARY = "YaST2 - AutoYaST Schema"
DESCRIPTION = "AutoYaST Syntax Schema"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-schema-default-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "87fb6aaf17833c2180cafa0d36df3726988c17784f39894f328fb696861cf573f647a07ae6ef6e72d3bc80893653d8494ca34a9c9dd2ebdb5fc5e382924949b4"

RPROVIDES:${PN} += "yast2-schema yast2-schema-default yast2-schema-default(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
