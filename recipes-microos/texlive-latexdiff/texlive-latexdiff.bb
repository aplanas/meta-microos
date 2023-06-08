SUMMARY = "Determine and mark up significant differences between LaTeX files"
DESCRIPTION = "Latexdiff is a Perl script for visual mark up and revision of \
significant differences between two LaTeX files. Various \
options are available for visual markup using standard LaTeX \
packages such as color. Changes not directly affecting visible \
text, for example in formatting commands, are still marked in \
the LaTeX source. A rudimentary revision facilility is provided \
by another Perl script, latexrevise, which accepts or rejects \
all changes. Manual editing of the difference file can be used \
to override this default behaviour and accept or reject \
selected changes only."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3.3svn64980"

RPM_NAME = "texlive-latexdiff-2023.201.1.3.3svn64980-54.1.noarch.rpm"
RPM_HASH = "05a8b489b22296135d43b0fbd6dc018dcbf304c0ca93e22d157eefcb01a9bcc448080120e9767cbd8e69691f2c4c8370e6bb2b26ddadd28140cbbc2fe188383c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexdiff"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Exporter) perl(File::Basename) perl(File::Copy) perl(File::Path) perl(File::Spec) perl(File::Temp) perl(Getopt::Long) perl(IPC::Open2) perl(IPC::Open3) perl(Pod::Usage) perl(constant) perl(integer) perl(strict) perl(utf8) perl(vars) perl(warnings) sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-latexdiff-bin texlive-scripts texlive-scripts-bin"

inherit rpm
