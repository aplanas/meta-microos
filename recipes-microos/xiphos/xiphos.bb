SUMMARY = "GNOME-based Bible research tool"
DESCRIPTION = "Bible Study Software for the Linux community. Lookup and search Bible texts and \
commentaries. Xiphos uses modules and libraries from the SWORD Project. \
Display multiple translations in the interlinear window. Search for passages in \
any translation by word, phrase, or regular expression. Install this package \
if you want to browse the Bible translations and reference works distributed \
by Crosswire Bible Society through the SWORD Project."
LICENSE = "GPL-2.0-only"

PV = "4.2.1.7"

RPM_NAME = "xiphos-4.2.1.7-1.15.aarch64.rpm"
RPM_HASH = "214671c9a902c209ff7cde2950bc0fd4a87950de0c6ecbacc0d6f5fec61a17e87a6bd77440afa0994f235c4a3cb92ccb363bcbd8c29fb11bac8420ba44c8777f"

RPROVIDES:${PN} += "application() application(xiphos.desktop) metainfo() metainfo(xiphos.appdata.xml) sword-frontend xiphos xiphos(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbiblesync.so.2.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-glib-1.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtkhtml-4.0.so.0()(64bit) libgtkhtml-editor-4.0.so.0()(64bit) libicui18n.so.72()(64bit) libminizip.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libsword-1.8.1.so()(64bit) libwebkit2gtk-4.0.so.37()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) sword"

inherit rpm
