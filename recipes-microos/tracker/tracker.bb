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

PV = "3.5.3"

RPM_NAME = "tracker-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "624d5cf7583d54765c49eb05d59f5b106aaefbf5542bfe3fa5aa1f46dbf55d45f37168a6c10ea59223bcd4607713d8e97e8aa2ac37b7e553546a56240485fc7b"

RPROVIDES:${PN} += "libtracker-http-soup3.so()(64bit) libtracker-parser-libicu.so()(64bit) tracker tracker(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libicui18n.so.73()(64bit) libicuuc.so.73()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsoup-3.0.so.0()(64bit) libsqlite3.so.0()(64bit) libtracker-sparql-3.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.17)(64bit) tracker-data-files"

inherit rpm
