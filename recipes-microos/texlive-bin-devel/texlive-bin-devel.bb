SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.20230311"

RPM_NAME = "texlive-bin-devel-2023.20230311-91.1.aarch64.rpm"
RPM_HASH = "6c9b2d23a2a3b5c9c7ecf5f433f3a3183ebe085d741ebe1b22395b7e3fbaf48f99b9462d7389084bd45cd8246ffebc3c5936e0ead5ce79d7936c103c284c35f9"

RPROVIDES:${PN} += "texlive-bin-devel \
texlive-bin-devel(aarch-64)"
RDEPENDS:${PN} += "libkpathsea6 \
libptexenc1 \
libsynctex2 \
libtexlua53-5 \
libtexluajit2 \
texlive-cweb-bin \
texlive-web-bin"

inherit rpm
