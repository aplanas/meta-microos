SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.3.5"

RPM_NAME = "texlive-kpathsea-devel-6.3.5-89.1.aarch64.rpm"
RPM_HASH = "25a050daae1c240b68eec61544d152b03f50d8864b04425b6c24986dde9d8ec7f3fdb06ac3ea7cda21f7cc05f33fb862688f1e18789d0e4f53910606fde728ae"

RPROVIDES:${PN} += "pkgconfig(kpathsea) texlive-kpathsea-devel texlive-kpathsea-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libkpathsea6"

inherit rpm
