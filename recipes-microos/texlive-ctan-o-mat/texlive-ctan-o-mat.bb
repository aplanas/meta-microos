SUMMARY = "Upload or validate a package for CTAN"
DESCRIPTION = "This program can be used to automate the upload of a package to \
CTAN. The description of the package is contained in a \
configuration file. The provided information is validated in \
any case. If the validation succeeds and not only the \
validation is requested, then the provided archive file will be \
placed in the incoming area of the CTAN for further processing \
by the CTAN team. In any case any finding during the validation \
is reported at the end of the processing. Note that the \
validation is the default and an official submission has to be \
requested by an appropriate command line option. ctan-o-mat \
requires an Internet connection to the CTAN server. Even the \
validation retrieves the known attributes and the basic \
constraints from the server."
LICENSE = "BSD-3-Clause"

PV = "2023.204.1.2svn51578"

RPM_NAME = "texlive-ctan-o-mat-2023.204.1.2svn51578-54.1.noarch.rpm"
RPM_HASH = "c49354aaa604cf20ef9314363692e05ee381569e941792c2aba5188d9fc9c87d235cf5dade1aa89fa491a38e2593b3bde02ff1fb98b087bf9b2e12cd74b50935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctan-o-mat"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl coreutils ed findutils grep perl(Cwd) perl(Data::Dumper) perl(File::Basename) perl(FileHandle) perl(Getopt::Long) perl(HTTP::Request::Common) perl(LWP::Protocol::https) perl(LWP::UserAgent) perl(Pod::Text) perl(constant) perl(strict) sed texlive texlive-ctan-o-mat-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
