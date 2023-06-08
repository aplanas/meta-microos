SUMMARY = "Development package for Subversion developers"
DESCRIPTION = "The subversion-devel package includes the static libraries and include \
files for developers interacting with the subversion package."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-devel-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "d57b9683b4d8bd4e79b82dde52479d1139d2034a967ad78d3beaa171c39d6b3e8f65cbc316c43ceb301470e1281c0a96050d1975bb58f21b7800c9a1e3ce62a5"

RPROVIDES:${PN} += "pkgconfig(libsvn_auth_gnome_keyring) pkgconfig(libsvn_auth_kwallet) pkgconfig(libsvn_client) pkgconfig(libsvn_delta) pkgconfig(libsvn_diff) pkgconfig(libsvn_fs) pkgconfig(libsvn_fs_base) pkgconfig(libsvn_fs_fs) pkgconfig(libsvn_fs_util) pkgconfig(libsvn_fs_x) pkgconfig(libsvn_ra) pkgconfig(libsvn_ra_local) pkgconfig(libsvn_ra_serf) pkgconfig(libsvn_ra_svn) pkgconfig(libsvn_repos) pkgconfig(libsvn_subr) pkgconfig(libsvn_wc) subversion-devel subversion-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libapr-util1-devel pkgconfig(apr-1) pkgconfig(apr-util-1) pkgconfig(libsecret-1) pkgconfig(serf-1) pkgconfig(sqlite3) subversion"

inherit rpm
