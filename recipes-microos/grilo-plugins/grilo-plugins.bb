SUMMARY = "Media and metadata plugins for the Grilo framework"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides plugins for accessing content from various media \
providers, including podcasts, Apple trailers, Flickr, \
Jamendo, Vimeo, YouTube."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugins-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "5d7a18f80d811d80cc944f70772bb9259006830f4a6cd2b4220de99a0bc95db1168cdfd87fe1c2995a6383f538896df0e87c636bd2cb1c4c795495bd0589a474"

RPROVIDES:${PN} += "grilo-plugins grilo-plugins(aarch-64) libgrlbookmarks.so()(64bit) libgrlchromaprint.so()(64bit) libgrldaap.so()(64bit) libgrldpap.so()(64bit) libgrlfilesystem.so()(64bit) libgrlflickr.so()(64bit) libgrlfreebox.so()(64bit) libgrlgravatar.so()(64bit) libgrllocalmetadata.so()(64bit) libgrlluafactory.so()(64bit) libgrlmagnatune.so()(64bit) libgrlmetadatastore.so()(64bit) libgrlopticalmedia.so()(64bit) libgrlpodcasts.so()(64bit) libgrlraitv.so()(64bit) libgrlshoutcast.so()(64bit) libgrlthetvdb.so()(64bit) libgrltmdb.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libavahi-client.so.3()(64bit) libavahi-glib.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) libdmapsharing-4.0.so.3()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgoa-1.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgom-1.0.so.0()(64bit) libgrilo-0.3.so.0()(64bit) libgrlnet-0.3.so.0()(64bit) libgrlpls-0.3.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) liblua5.4.so.5()(64bit) libmediaart-2.0.so.0()(64bit) liboauth.so.0()(64bit) libsqlite3.so.0()(64bit) libtotem-plparser-mini.so.18()(64bit) libtotem-plparser-mini.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) libtotem-plparser.so.18()(64bit) libtotem-plparser.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
