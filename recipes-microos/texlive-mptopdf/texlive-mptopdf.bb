SUMMARY = "Mpost to PDF, native MetaPost graphics inclusion"
DESCRIPTION = "The mptopdf script does standalone conversion from mpost to \
PDF, using the supp-* and syst-* files. They also allow native \
MetaPost graphics inclusion in LaTeX (via pdftex.def) and \
ConTeXt. They can be used independently of the rest of ConTeXt, \
yet are maintained as part of it. So in TeX Live we pull them \
out to this separate package for the benefit of LaTeX users who \
do not install the rest of ConTeXt. This can be found on CTAN \
in macros/pdftex/graphics."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65952"

RPM_NAME = "texlive-mptopdf-2023.201.svn65952-54.1.noarch.rpm"
RPM_HASH = "8cc6f39cd2890ca7641e2bae5e8cfa2f4813cd791886c168fc9b3f31e936528ffd69426404a9efd849177d323f777f1cecf7d051d360743d6698654f78f72a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mptopdf.tex) \
texlive-mptopdf"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Config) \
perl(File::Basename) \
perl(Getopt::Long) \
perl(strict) \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mptopdf-bin \
texlive-plain \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
