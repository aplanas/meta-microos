SUMMARY = "Prepare a package for upload to CTAN"
DESCRIPTION = "Given a list of filenames, ctanify creates a tarball (a .tar.gz \
file) with the files laid out in CTAN's preferred structure. By \
default this tarball additionally contains a ZIP (.zip) file \
with copies of all files laid out in the standard TeX Directory \
Structure (TDS), which may be used by those intending to \
install the package, or by those who need to incorporate it in \
a distribution. (The TDS ZIP file will be installed in the CTAN \
install/ tree.) Given that CTAN and TeX Live are not fond of \
.tds.zip files for small and/or otherwise straightforward \
packages, ctanify has now been provided with an option that \
prevents the creation and inclusion of such a .tds.zip file."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.9.1svn44129"

RPM_NAME = "texlive-ctanify-2023.204.1.9.1svn44129-54.1.noarch.rpm"
RPM_HASH = "4b531ee2d69174c7e95276ef53540d326ff69191c0200cc8d44fb2f0293cb27c1c7889dd8f28272720ead39cdaab6549eb014c44ce2bc98560514a292e575ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanify"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Cwd) \
perl(File::Basename) \
perl(File::Copy::Recursive) \
perl(File::Find) \
perl(File::Path) \
perl(File::Spec) \
perl(File::Temp) \
perl(File::stat) \
perl(Getopt::Long) \
perl(Pod::Usage) \
perl(strict) \
perl(warnings) \
sed \
texlive \
texlive-ctanify-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
