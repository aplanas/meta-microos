SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "2.3.4"

RPM_NAME = "libidn2-devel-2.3.4-1.3.aarch64.rpm"
RPM_HASH = "3f586aff7e34ddd946a662b069e282dc3e6fb15199c7b1905d31224769e1aeb620ac278c72870d92041ca17680f95903f8183371cc55d2cb039d45ccc9367b1c"

RPROVIDES:${PN} += "libidn2-devel libidn2-devel(aarch-64) pkgconfig(libidn2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libidn2-0"

inherit rpm
