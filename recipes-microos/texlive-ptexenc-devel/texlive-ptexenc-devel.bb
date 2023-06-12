SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "This package includes the ptexenc development files. \
The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "texlive-ptexenc-devel-1.4.3-91.1.aarch64.rpm"
RPM_HASH = "9e960b948f9e8f0d0bae9d9e2aa719d397664246a2dd0fe7d9d7f639532698251999658e7a6d7e0bdcd82a10ebcdac3e126618e52a2b79bd7edc6a37b7b6a709"

RPROVIDES:${PN} += "pkgconfig(ptexenc) \
texlive-ptexenc-devel \
texlive-ptexenc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptexenc1 \
pkgconfig(kpathsea)"

inherit rpm
