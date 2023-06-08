SUMMARY = "Define LaTeX macros in terms of Perl code"
DESCRIPTION = "PerlTeX is a combination Perl script (perltex.pl) and LaTeX2e \
package (perltex.sty) that, together, give the user the ability \
to define LaTeX macros in terms of Perl code. Once defined, a \
Perl macro becomes indistinguishable from any other LaTeX \
macro. PerlTeX thereby combines LaTeX's typesetting power with \
Perl's programmability. PerlTeX will make use of persistent \
named pipes, and thereby run more efficiently, on operating \
systems that offer them (mostly Unix-like systems). Also \
provided is a switch to generate a PerlTeX-free, \
document-specific, noperltex.sty that is useful when \
distributing a document to places where PerlTeX is not \
available."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn52162"

RPM_NAME = "texlive-perltex-2023.201.2.2svn52162-51.1.noarch.rpm"
RPM_HASH = "47d754f208cfc32c2799d307adb7fc9de29592a6a73d3051182a8be01226651570e01f639f66ce25f467b78071322cd39eb7e911866fe1ad6d0e34629f272730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(perltex.sty) texlive-perltex"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Fcntl) perl(File::Basename) perl(File::Spec) perl(Getopt::Long) perl(IO::Handle) perl(Opcode) perl(POSIX) perl(Pod::Usage) perl(Safe) perl(strict) perl(warnings) sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-perltex-bin texlive-scripts texlive-scripts-bin"

inherit rpm
