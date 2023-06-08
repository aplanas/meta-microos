SUMMARY = "Zathura PDF support through MuPDF"
DESCRIPTION = "Zathura-plugin-MupDF extends the document viewing support of Zathura to PDF, EPUB and OpenXPS with the help of MuPDF rendering engine."
LICENSE = "Zlib"

PV = "0.4.0"

RPM_NAME = "zathura-plugin-pdf-mupdf-0.4.0-3.3.aarch64.rpm"
RPM_HASH = "df9022bea471de685d5a38270585a9d0049ce770eb715a6ac8072762974dd82984d987a0a7f7f0edb12f3299ac405eb94cc4082ba9290c4615dfbc27309136ce"

RPROVIDES:${PN} += "libpdf-mupdf.so()(64bit) metainfo() metainfo(org.pwmt.zathura-pdf-mupdf.metainfo.xml) zathura-pdf-mupdf-plugin zathura-plugin-pdf-mupdf zathura-plugin-pdf-mupdf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libgirara-gtk3.so.3()(64bit) libglib-2.0.so.0()(64bit) libharfbuzz.so.0()(64bit) libjbig2dec.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libopenjp2.so.7()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) mupdf zathura"

inherit rpm
