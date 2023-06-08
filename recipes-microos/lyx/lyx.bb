SUMMARY = "WYSIWYM (What You See Is What You Mean) document processor"
DESCRIPTION = "LyX is a document processor that encourages an approach to writing \
based on the structure of your documents, not their appearance. The \
author can concentrate on the content (What You See Is What You Mean). \
The formatting is done by the backends (like LaTeX) and the output can \
have different formats, such as DVI, postscript, PDF, html. \
 \
LyX can check the LaTeX installation by opening the LaTeX Configuration \
document under 'Help' on the menubar. \
 \
LyX uses ImageMagick to deal with images. For security reasons \
(open)SUSE limits the functionaly of ImageMagick. See README.SUSE \
(in /usr/share/doc/packages/lyx/) for more information."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.7"

RPM_NAME = "lyx-2.3.7-1.3.aarch64.rpm"
RPM_HASH = "e02fdd7e0dcf2bf53c7ae8bacee5cd94485be10f3e8fcea6d18eac8e47b728e76bae926e83efe4a51a62cc21d3da02501ba578f6d351e23cd648cc54202ff20e"

RPROVIDES:${PN} += "application() application(lyx.desktop) lyx lyx(aarch-64) metainfo() metainfo(lyx.appdata.xml) mimehandler(application/x-lyx) mimehandler(text/x-lyx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/python3 ImageMagick aaa_base coreutils ghostscript ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libenchant-2.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhunspell-1.7.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmagic.so.1()(64bit) libmythes-1.2.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) lyx-fonts perl"

inherit rpm
