SUMMARY = "Sparql library for Tracker"
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

RPM_NAME = "libtracker-sparql-3_0-0-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "441fdfef4895771422af4c084f201cd7bf85337b58e9524b8d7ae55809e98cd72fb75d20947035cafe865b362b746858a43d1879f98431b96edaab7a40e36770"

RPROVIDES:${PN} += "libtracker-sparql-3.0.so.0()(64bit) libtracker-sparql-3_0-0 libtracker-sparql-3_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.17)(64bit)"

inherit rpm
