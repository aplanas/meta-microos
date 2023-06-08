SUMMARY = "Filter clutter from the output of a TeX run"
DESCRIPTION = "The package provides a small Perl script to filter the online \
output from a TeX run, attempting to show only those messages \
which probably deserve some change in the source. The TeX \
invocation itself need not change."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.48svn65545"

RPM_NAME = "texlive-texfot-2023.201.1.48svn65545-54.1.noarch.rpm"
RPM_HASH = "72bd6203c61104dfe92807fd93b961ff67bd8cbf442989cbadc2627a1d84b09c11bee7b780381681b9d88e3de73ca131dc002e5a058a01ead93b67ad7369bf9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texfot"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Getopt::Long) perl(IO::File) perl(IPC::Open3) perl(Pod::Usage) sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-texfot-bin"

inherit rpm
