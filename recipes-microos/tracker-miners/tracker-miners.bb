SUMMARY = "Various miners for Tracker"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
These are the sources for the various miners (e.g. files, rss)"
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "tracker-miners-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "044d38aa66b966dd032cf1d0439ad5c605720e6e95453ef1ea54a156930014b6cc5c5e5ebe487915aa601de389012df94b964341d3b01078550e7f6b6173879c"

RPROVIDES:${PN} += "libextract-abw.so()(64bit) libextract-bmp.so()(64bit) libextract-desktop.so()(64bit) libextract-disc-generic.so()(64bit) libextract-dummy.so()(64bit) libextract-epub.so()(64bit) libextract-gif.so()(64bit) libextract-gstreamer.so()(64bit) libextract-html.so()(64bit) libextract-icon.so()(64bit) libextract-iso.so()(64bit) libextract-jpeg.so()(64bit) libextract-mp3.so()(64bit) libextract-msoffice-xml.so()(64bit) libextract-msoffice.so()(64bit) libextract-oasis.so()(64bit) libextract-pdf.so()(64bit) libextract-playlist.so()(64bit) libextract-png.so()(64bit) libextract-ps.so()(64bit) libextract-raw.so()(64bit) libextract-text.so()(64bit) libextract-tiff.so()(64bit) libextract-xps.so()(64bit) libtracker-extract.so()(64bit) libwriteback-gstreamer.so()(64bit) libwriteback-xmp.so()(64bit) tracker-miners tracker-miners(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcue.so.2()(64bit) libexempi.so.8()(64bit) libexif.so.12()(64bit) libgexiv2.so.2()(64bit) libgif.so.7()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsf-1.so.114()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libgxps.so.2()(64bit) libicui18n.so.72()(64bit) libiptcdata.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libosinfo-1.0.so.0()(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.0.1)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.0.3)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.3)(64bit) libosinfo-1.0.so.0(LIBOSINFO_0.2.9)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpoppler-glib.so.8()(64bit) libseccomp.so.2()(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libtiff.so.6(LIBTIFF_4.1)(64bit) libtotem-plparser.so.18()(64bit) libtotem-plparser.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) libtracker-sparql-3.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) tracker tracker-data-files"

inherit rpm
