SUMMARY = "Parse 02packages.details.txt.gz"
DESCRIPTION = "The Comprehensive Perl Archive Network (CPAN) is a very useful collection \
of Perl code. It has several indices of the files that it hosts, including \
a file named '02packages.details.txt.gz' in the 'modules' directory. This \
file contains lots of useful information and this module provides a simple \
interface to the data contained within. \
 \
In a future release the Parse::CPAN::Packages::Package manpage and the \
Parse::CPAN::Packages::Distribution manpage might have more information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.40"

RPM_NAME = "perl-Parse-CPAN-Packages-2.40-1.25.noarch.rpm"
RPM_HASH = "edd67c205d191c95519dabc48b6f8e44302fe8770b1c095c0b9d8637e9c94d50eca1bcd14a6c619119deac7047cf934ba556af2d14975fc6d7e75b7d4b17f0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Parse::CPAN::Packages) perl(Parse::CPAN::Packages::Distribution) perl(Parse::CPAN::Packages::Package) perl-Parse-CPAN-Packages"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Archive::Peek) perl(CPAN::DistnameInfo) perl(Compress::Zlib) perl(File::Slurp) perl(Moo) perl(PPI) perl(Path::Class) perl(Test::InDistDir) perl(Type::Utils) perl(Types::Standard) perl(version)"

inherit rpm
