SUMMARY = "Dictionary Lookup Program"
DESCRIPTION = "Feature-rich dictionary lookup program. \
    * Support of multiple dictionary file formats: \
      * Babylon .BGL files \
      * StarDict .ifo/.dict/.idx/.syn dictionaries \
      * Dictd .index/.dict(.dz) dictionary files \
      * ABBYY Lingvo .dsl source files \
      * ABBYY Lingvo .lsa/.dat audio archives \
    * Support for Wikipedia, Wiktionary or any other MediaWiki-based sites \
    * Scan popup functionality. A small window pops up with translation of a \
      word chosen from antoher application. \
    * Full-text search."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.0~rc2+git.20220215T203220"

RPM_NAME = "goldendict-1.5.0~rc2+git.20220215T203220-2.8.aarch64.rpm"
RPM_HASH = "b502fd4cb39b610c2224b1b707bf862c5d3a428c17ff93b1f9a58307738c36a3a1cb76402ae2ae9385722b57df4767280c98719843fd19ecfa637fc5a3dd3953"

RPROVIDES:${PN} += "application() application(org.goldendict.GoldenDict.desktop) goldendict goldendict(aarch-64) metainfo() metainfo(org.goldendict.GoldenDict.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Help.so.5()(64bit) libQt5Help.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libao.so.4()(64bit) libao.so.4(LIBAO4_1.1.0)(64bit) libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavformat.so.59()(64bit) libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libeb.so.16()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhunspell-1.7.so.0()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) liblzo2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libswresample.so.4.ff5()(64bit) libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libvorbisfile.so.3()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libz.so.1(ZLIB_1.2.0.2)(64bit) libz.so.1(ZLIB_1.2.2.3)(64bit) libzstd.so.1()(64bit)"

inherit rpm
