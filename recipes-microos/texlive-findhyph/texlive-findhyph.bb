SUMMARY = "Find hyphenated words in a document"
DESCRIPTION = "Findhyph is a Perl script that will analyse the log file from \
running your document with \\tracingparagraphs=1 set. The output \
contains enough context to enable you to find the hyphenated \
word that's being referenced."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.4svn47444"

RPM_NAME = "texlive-findhyph-2023.201.3.4svn47444-52.1.noarch.rpm"
RPM_HASH = "4833621e5a8ad96a6b831e81c13adef8df4f35d456291ee5c1c75687cfa2681e76739a0457e489eec0065ee390ca7215e85a0ed3a87fb3cc59898177c6f28d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-findhyph"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Getopt::Std) \
perl(warnings) \
sed \
texlive \
texlive-filesystem \
texlive-findhyph-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
