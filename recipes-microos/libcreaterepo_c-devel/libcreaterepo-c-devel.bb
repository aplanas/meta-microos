SUMMARY = "Library for repodata manipulation"
DESCRIPTION = "This package contains the createrepo_c C library and header files. \
These development files are for easy manipulation with a repodata."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "libcreaterepo_c-devel-0.20.1-2.3.aarch64.rpm"
RPM_HASH = "ab986a2e9453ae32ab45e112871063d7ca5e6fc0ebc2fcbba620fa3f7af6bbea7382a47a3db0cf53ff37c5981a8b739accbbac72d8b10ff59e901c172f7cbaca"

RPROVIDES:${PN} += "createrepo_c-devel libcreaterepo_c-devel libcreaterepo_c-devel(aarch-64) pkgconfig(createrepo_c)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcreaterepo_c0(aarch-64) pkgconfig pkgconfig(glib-2.0) pkgconfig(libcurl) pkgconfig(libxml-2.0) pkgconfig(rpm) pkgconfig(sqlite3) pkgconfig(zlib)"

inherit rpm
