SUMMARY = "LibreOffice Draw"
DESCRIPTION = "This module allows you to create and edit drawings, flow charts, and \
logos by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-draw-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "fb9ce35cbb986884cb449b387b5fdafe806e329035f3e5a1c0735a45415ca391d67600ee638b00858a53c39357c516d6917d765a6cc5b9a8494e3f603bf242dd"

RPROVIDES:${PN} += "application() application(libreoffice-draw.desktop) libpdfimportlo.so()(64bit) libreoffice-draw libreoffice-draw(aarch-64) metainfo() metainfo(libreoffice-draw.appdata.xml) mimehandler(application/clarisworks) mimehandler(application/pdf) mimehandler(application/vnd.corel-draw) mimehandler(application/vnd.ms-publisher) mimehandler(application/vnd.oasis.opendocument.graphics) mimehandler(application/vnd.oasis.opendocument.graphics-flat-xml) mimehandler(application/vnd.oasis.opendocument.graphics-template) mimehandler(application/vnd.sun.xml.draw) mimehandler(application/vnd.sun.xml.draw.template) mimehandler(application/vnd.visio) mimehandler(application/x-pagemaker) mimehandler(application/x-stardraw) mimehandler(application/x-wpg) mimehandler(image/x-emf) mimehandler(image/x-freehand) mimehandler(image/x-wmf)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmergedlo.so()(64bit) libpoppler.so.127()(64bit) libreoffice libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libuno_cppu.so.3()(64bit) libuno_cppu.so.3(LIBO_UDK_4.4)(64bit) libuno_cppu.so.3(UDK_3.1)(64bit) libuno_cppu.so.3(UDK_3.3)(64bit) libuno_cppu.so.3(UDK_3_0_0)(64bit) libuno_cppuhelpergcc3.so.3()(64bit) libuno_cppuhelpergcc3.so.3(LIBO_UDK_3.9)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) libuno_sal.so.3()(64bit) libuno_sal.so.3(LIBO_UDK_3.6)(64bit) libuno_sal.so.3(LIBO_UDK_4.0)(64bit) libuno_sal.so.3(LIBO_UDK_4.1)(64bit) libuno_sal.so.3(LIBO_UDK_5.1)(64bit) libuno_sal.so.3(LIBO_UDK_5.3)(64bit) libuno_sal.so.3(PRIVATE_1.6)(64bit) libuno_sal.so.3(UDK_3.1)(64bit) libuno_sal.so.3(UDK_3.3)(64bit) libuno_sal.so.3(UDK_3.6)(64bit) libuno_sal.so.3(UDK_3.8)(64bit) libuno_sal.so.3(UDK_3_0_0)(64bit) libz.so.1()(64bit) rtld(GNU_HASH)"

inherit rpm
