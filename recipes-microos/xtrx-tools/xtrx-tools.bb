SUMMARY = "Tools for XTRX"
DESCRIPTION = "Tools for XTRX SDR devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrx-tools-0.0.0+git.20201202-3.7.aarch64.rpm"
RPM_HASH = "52c50bc42bae6c873d486c037029c901aa9a955addab28ee7943b53b045eb0c98aaff647cb088c17562f65c592700dce722226ee80c904a8b6c98bb3a4b65960"

RPROVIDES:${PN} += "xtrx-tools xtrx-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libSoapySDR.so.0.8()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libqcustomplot.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxtrx.so.0()(64bit) soapysdr0.8-module-xtrx"

inherit rpm
