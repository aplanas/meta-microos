SUMMARY = "Development files for sanlock"
DESCRIPTION = "The sanlock-devel package contains libraries and header files for \
developing applications that use sanlock."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "sanlock-devel-3.8.5-1.3.aarch64.rpm"
RPM_HASH = "01729722c551145f5410b092864adfcdcf9468ed0b677ef0f1c35879b31885b2d411e5aa856f529f27e571830c7f57470569364678d2e5b2161de55b538fc68e"

RPROVIDES:${PN} += "pkgconfig(libsanlock) \
pkgconfig(libsanlock_client) \
sanlock-devel \
sanlock-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsanlock1"

inherit rpm
