SUMMARY = "Basic TeX Live infrastructure"
DESCRIPTION = "This package contains the files needed to get tlmgr running: \
perl modules, xz binaries, plus (sometimes) tar, wget, lz4, and \
various other support files. This package also represents the \
tlcritical recovery scripts. The standalone installer is close, \
but not the same; it's defined in 00texlive.installer."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66512"

RPM_NAME = "texlive-texlive.infra-2023.201.svn66512-54.1.noarch.rpm"
RPM_HASH = "56063696c730a7b9b4fc99b6e61178396f05531ce98377a339482224eb5a589dc80be07f561beccd60cfa175e456b279112aa7e62c4018ffefd9ba4a1870d879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(TeXLive::TLConfFile) \
perl(TeXLive::TLConfig) \
perl(TeXLive::TLCrypto) \
perl(TeXLive::TLPDB) \
perl(TeXLive::TLPOBJ) \
perl(TeXLive::TLPSRC) \
perl(TeXLive::TLPaper) \
perl(TeXLive::TLTREE) \
perl(TeXLive::TLUtils) \
perl(TeXLive::TLWinGoo) \
perl(TeXLive::TeXCatalogue) \
perl(TeXLive::TeXCatalogue::Entry) \
tex(fmtutil-hdr.cnf) \
tex(updmap-hdr.cfg) \
texlive-texlive.infra"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
