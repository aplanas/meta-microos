SUMMARY = "Imlib 2 - image loaders"
DESCRIPTION = "This package contains the imlib2 image loaders for: argb, bmp, gif, \
jpeg, png, pnm, tga, tiff, xpm, j2k, heif, jxl."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "imlib2-loaders-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "d50301e0a6ea85b45126cde18e058db57b439d08a7490df4e7a55103ff7431c9220791fcbda3be20056ce4eb18bc1017cce055c878ebc7a6f27d1d2097bf07fe"

RPROVIDES:${PN} += "imlib2-loader_argb imlib2-loader_bmp imlib2-loader_bz2 imlib2-loader_gif imlib2-loader_heif imlib2-loader_j2k imlib2-loader_jpeg imlib2-loader_jxl imlib2-loader_png imlib2-loader_pnm imlib2-loader_tga imlib2-loader_tiff imlib2-loader_xpm imlib2-loader_zlib imlib2-loaders imlib2-loaders(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImlib2.so.1()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgif.so.7()(64bit) libheif.so.1()(64bit) libid3tag.so.0.16.2()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libjxl.so.0.8()(64bit) libjxl.so.0.8(JXL_0)(64bit) libjxl_threads.so.0.8()(64bit) libjxl_threads.so.0.8(JXL_0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libopenjp2.so.7()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libwebp.so.7()(64bit) libwebpdemux.so.2()(64bit) libz.so.1()(64bit)"

inherit rpm
