SUMMARY = "Document viewer for documents like PDF/PostScript"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "87214d3af978d7049e068aede69bd6b71f112da4154d9aee5529ca67ed4e63c794c6c40384def397183cace254a631258f47d0ac741afcea9c10df9495457709"

RPROVIDES:${PN} += "application() application(xreader.desktop) caja-extension-xreader metainfo() metainfo(xreader.appdata.xml) mimehandler(application/epub+zip) mimehandler(application/oxps) mimehandler(application/pdf) mimehandler(application/postscript) mimehandler(application/vnd.comicbook+zip) mimehandler(application/vnd.comicbook-rar) mimehandler(application/vnd.ms-xpsdocument) mimehandler(application/x-bzdvi) mimehandler(application/x-bzpdf) mimehandler(application/x-bzpostscript) mimehandler(application/x-cb7) mimehandler(application/x-cbr) mimehandler(application/x-cbt) mimehandler(application/x-cbz) mimehandler(application/x-dvi) mimehandler(application/x-gzdvi) mimehandler(application/x-gzpdf) mimehandler(application/x-gzpostscript) mimehandler(application/x-xzpdf) mimehandler(image/*) mimehandler(image/tiff) mimehandler(image/vnd.djvu) mimehandler(image/vnd.djvu+multipage) mimehandler(image/x-bzeps) mimehandler(image/x-eps) mimehandler(image/x-gzeps) nemo-extension-xreader xreader xreader(aarch-64) xreader-backends"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libxapp.so.1()(64bit) libxreaderdocument.so.3()(64bit) libxreaderview.so.3()(64bit) xreader-plugin-pdfdocument"

inherit rpm
