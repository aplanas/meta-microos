SUMMARY = "Shared MIME Database"
DESCRIPTION = "This package contains: \
 \
- The freedesktop.org shared MIME database spec. \
 \
- The merged GNOME and KDE databases, in the new format. \
 \
- The update-mime-database command, used to install new MIME data."
LICENSE = "GPL-2.0-or-later"

PV = "2.2"

RPM_NAME = "shared-mime-info-2.2-2.1.aarch64.rpm"
RPM_HASH = "6b052742ca489d755bf4844d7f6d0c5d0fdbe498d91cee5701ec903c427ba95f6d53ad8acd7e426d017b0861276345315dc7cfb4ca91c2b61f3bb9c25f7590d6"

RPROVIDES:${PN} += "pkgconfig(shared-mime-info) \
rpm_macro(mime_database_post) \
rpm_macro(mime_database_postun) \
shared-mime-info \
shared-mime-info(aarch-64) \
shared-mime-info-devel"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
