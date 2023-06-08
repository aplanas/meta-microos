SUMMARY = "CWEB for ANSI-C/C++ compilers"
DESCRIPTION = "A highly portable and extended version of Levy/Knuth CWEB 3.64c \
for UNIX, Windows, Mac (and possibly other operating systems). \
TeX macros, CWEB macros, and NLS catalogs are included for \
German, French (partially), and Italian program documentation \
on any machine. Major features: Thoroughly updated code base; \
several bug fixes; clean compilation (with both C and TeX) on \
at least four different architectures. Added CTWILL program \
with tools and utilities for brave users; including \
introductory manpage. Internationalization of CTANGLE, CWEAVE, \
and CTWILL with 'GNU gettext utilities'. New code base for CWEB \
in TeX Live 2019, incorporating all features of the TL 2018 \
version and adding new features from CWEBbin. As of November \
2019 CTAN no longer holds a copy of this material. Please go to \
the package's github repository for more information."
LICENSE = "SUSE-TeX"

PV = "2023.204.svn66186"

RPM_NAME = "texlive-cweb-2023.204.svn66186-54.1.noarch.rpm"
RPM_HASH = "c6b89002fbe405b6ff345826a4eadca70642df6e804e6f441093ac61fdc49c10954470c11b1491146b931696e9d2f6c7c4a9e001f8c2a8aa90c5a1beee223b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Xcwebmac.tex) tex(ctproofmac.tex) tex(cttwinxmac.tex) tex(ctwimac.tex) tex(cweb_ecma94.sty) tex(cweb_hp8.sty) tex(cweb_mac8.sty) tex(cweb_pc850.sty) tex(cwebmac.tex) tex(dctproofmac.tex) tex(dctwimac.tex) tex(dcwebmac.tex) tex(dcwebstrings.tex) tex(fcwebmac.tex) tex(icwebmac.tex) tex(pdfctwimac.tex) tex(pdfwebtocfront.tex) tex(twinx-startup.tex) texlive-cweb"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-cweb-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
