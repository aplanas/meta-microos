SUMMARY = "Use New Century Schoolbook text with Fourier maths fonts"
DESCRIPTION = "This package provides a LaTeX mathematics font setup for use \
with New Century Schoolbook text. In order to use it you need \
to have the Fourier-GUTenberg fonts installed."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29646"

RPM_NAME = "texlive-fouriernc-2023.201.svn29646-52.1.noarch.rpm"
RPM_HASH = "e0a88ed3e6aa5bdd02e8b41d42cb1a1561bf7e105788a54d5c6a9f9fbb3fff44fcda0fb4c442742f5f23e30298f932b846ca5f1739d5d9d55a20c336a315acbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fmlfncm.fd) tex(fmlfncmi.fd) tex(fmsfncm.fd) tex(fncmi.tfm) tex(fncmi.vf) tex(fncmib.tfm) tex(fncmib.vf) tex(fncmii.tfm) tex(fncmii.vf) tex(fncmiib.tfm) tex(fncmiib.vf) tex(fncsy.tfm) tex(fncsy.vf) tex(fouriernc.sty) tex(t1fnc.fd) tex(ts1fnc.fd) texlive-fouriernc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fourier-mcl.tfm) tex(fourier-ml.tfm) tex(fourier-mlb.tfm) tex(fourier-mlit.tfm) tex(fourier-mlitb.tfm) tex(fourier-ms.tfm) tex(fourier.sty) tex(pncb8r.tfm) tex(pncbi8r.tfm) tex(pncr8r.tfm) tex(pncri8r.tfm) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
