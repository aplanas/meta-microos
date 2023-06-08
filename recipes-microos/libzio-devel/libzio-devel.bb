SUMMARY = "Libzio development files"
DESCRIPTION = "Libzio development files including zio.h, the manual page fzopen(3), \
and static library."
LICENSE = "GPL-2.0-or-later"

PV = "1.08"

RPM_NAME = "libzio-devel-1.08-2.7.aarch64.rpm"
RPM_HASH = "5b41ba8e5795dbacab0f5757a582362f6e1f7e43d8ad11237c123dd1b0a5b026afa4f7d7b8ca0d1cda6618389a5c4bef1ad783fd319272cde09e641e6092f785"

RPROVIDES:${PN} += "libzio-devel libzio-devel(aarch-64)"
RDEPENDS:${PN} += "libzio1"

inherit rpm
