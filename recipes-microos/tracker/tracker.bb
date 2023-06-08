SUMMARY = "Object database, tag/metadata database, search tool and indexer"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
It consists of a common object database that allows entities to \
have an almost infinite number of properties, metadata (both \
embedded/harvested as well as user definable), a comprehensive \
database of keywords/tags and links to other entities. \
 \
It provides context linking and audit trails for file objects. \
It has the ability to index, store, harvest metadata, retrieve \
and search all types of files and other first class objects."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "tracker-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "85e85f1124c64108bf377cfb917b33df359575f3254dc8676b6322d7aad90d4b3c53b30d0cd318202aa4a18dfe7cadd098fb10046eb43d502eb039e5ce7ec559"

RPROVIDES:${PN} += "libtracker-http-soup3.so()(64bit) libtracker-parser-libicu.so()(64bit) tracker tracker(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsoup-3.0.so.0()(64bit) libsqlite3.so.0()(64bit) libtracker-sparql-3.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.17)(64bit) tracker-data-files"

inherit rpm
