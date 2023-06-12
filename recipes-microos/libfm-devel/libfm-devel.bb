SUMMARY = "Devel files for libfm"
DESCRIPTION = "A glib/gio-based lib used to develop file managers providing some \
file management utilities and related-widgets missing in gtk+/glib."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-devel-1.3.2-1.12.aarch64.rpm"
RPM_HASH = "bf2b8fde6c62d765bf86f6a1b659330f4dff3428cf389b1c51477ca3542bd96dba150eb8d428feab7b46acecbe1533c2c44213091546c1f79ceb9f15077a61ba"

RPROVIDES:${PN} += "libfm-devel \
libfm-devel(aarch-64) \
pkgconfig(libfm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm \
libfm4 \
pkgconfig \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gthread-2.0) \
pkgconfig(libfm-extra)"

inherit rpm
