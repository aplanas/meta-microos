SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "This package includes the ptexenc development files. \
The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "texlive-ptexenc-devel-1.4.3-89.1.aarch64.rpm"
RPM_HASH = "5a179cac19e20773f830526669d790639cb2ff4b094217f7922c0f0f7bf9bc6ba3e73104ed99c2363f49b074b4629ad80406d26dc8636d9ad1a3d4a68d23f718"

RPROVIDES:${PN} += "pkgconfig(ptexenc) texlive-ptexenc-devel texlive-ptexenc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libptexenc1 pkgconfig(kpathsea)"

inherit rpm
