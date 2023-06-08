SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.20230311"

RPM_NAME = "texlive-bin-devel-2023.20230311-89.1.aarch64.rpm"
RPM_HASH = "dda3fe1f4a03fd9905b8a0895bc2f4a90148f4ff1df46edcebb233063ad2d76008e1591eb6ce5fd17872b83d5ad97d9e3b4cd9d208a644e4c5eccf60abf68f1b"

RPROVIDES:${PN} += "texlive-bin-devel texlive-bin-devel(aarch-64)"
RDEPENDS:${PN} += "libkpathsea6 libptexenc1 libsynctex2 libtexlua53-5 libtexluajit2 texlive-cweb-bin texlive-web-bin"

inherit rpm
