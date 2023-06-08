SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "libgitg-1_0-0-41-2.8.aarch64.rpm"
RPM_HASH = "e909ef3209d9a94c2e926469ba1658d7c809f86d9329f8cbdecc4d364b378da8870b3957185b7d751e251530fdaa9996b9c16972fd1add1af1ef22ae150168bc"

RPROVIDES:${PN} += "libgitg-1.0.so.0()(64bit) libgitg-1_0-0 libgitg-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libdazzle-1.0.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libgit2-glib-1.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libpango-1.0.so.0()(64bit) libsecret-1.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.17)(64bit)"

inherit rpm
