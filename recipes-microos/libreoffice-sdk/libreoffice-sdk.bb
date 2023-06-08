SUMMARY = "LibreOffice SDK"
DESCRIPTION = "This package contains the files needed to build plugins/add-ons for \
LibreOffice. It includes header files, IDL files, needed build \
tools, etc. \
 \
The documentation is in the package libreoffice-sdk-doc"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-sdk-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "14c9c0eb0c8ccb163104181a141cd93d4279a42b4c018b69f16fc431a193ca1330c814d6ff5a91f2d45e023f865777bdcdf34ae67ae675bdd4821148608b13bf"

RPROVIDES:${PN} += "libreoffice-sdk libreoffice-sdk(aarch-64) libreoffice-ure-devel"
RDEPENDS:${PN} += "/bin/sh gcc-c++ ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libreoffice libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuno_sal.so.3()(64bit) libuno_sal.so.3(LIBO_UDK_3.6)(64bit) libuno_sal.so.3(LIBO_UDK_4.0)(64bit) libuno_sal.so.3(LIBO_UDK_4.1)(64bit) libuno_sal.so.3(PRIVATE_1.1)(64bit) libuno_sal.so.3(UDK_3.1)(64bit) libuno_sal.so.3(UDK_3.3)(64bit) libuno_sal.so.3(UDK_3.8)(64bit) libuno_sal.so.3(UDK_3_0_0)(64bit) libuno_salhelpergcc3.so.3()(64bit) libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) libunoidllo.so()(64bit) make rtld(GNU_HASH) ucpp zip"

inherit rpm
