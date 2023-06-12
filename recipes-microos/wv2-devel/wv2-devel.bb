SUMMARY = "Library for Importing Microsoft Word(tm) Documents - development files"
DESCRIPTION = "The wv2 library is used to import Microsoft Word documents in koffice \
for example."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "wv2-devel-0.4.2-25.5.aarch64.rpm"
RPM_HASH = "13948ab44a59deeaf6db3ee746cf41c3a4399fe8ceb5ee43863cb7015eab6b3afa1a925aecdb334a2062a2f472481a8befa48c8a6d057e3ddbfa6d15f3ee3552"

RPROVIDES:${PN} += "wv2-devel \
wv2-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libgsf-devel \
libstdc++-devel \
libwv2-4"

inherit rpm
