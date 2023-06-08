SUMMARY = "Manage perl installations in your C<$HOME>"
DESCRIPTION = "perlbrew is a program to automate the building and installation of perl in \
an easy way. It provides multiple isolated perl environments, and a \
mechanism for you to switch between them. \
 \
Everything are installed unter '~/perl5/perlbrew'. You then need to include \
a bashrc/cshrc provided by perlbrew to tweak the PATH for you. You then can \
benefit from not having to run 'sudo' commands to install cpan modules \
because those are installed inside your 'HOME' too. \
 \
For the documentation of perlbrew usage see perlbrew command on at \
https://metacpan.org/, or by running 'perlbrew help', or by visiting at \
https://perlbrew.pl/. The following documentation features the API of \
'App::perlbrew' module, and may not be remotely close to what your want to \
read."
LICENSE = "MIT"

PV = "0.96"

RPM_NAME = "perl-App-perlbrew-0.96-1.2.noarch.rpm"
RPM_HASH = "285d7fde8e70a87b6c689b45bc0d75510a8fec39fec6ea7f0fbb58ff91d8327181a4459e0eedd86c1484316ccb8e32d92c2778bbdc7b5d213a8607c92c095537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(App::Perlbrew::HTTP) perl(App::Perlbrew::Path) perl(App::Perlbrew::Path::Installation) perl(App::Perlbrew::Path::Installations) perl(App::Perlbrew::Path::Root) perl(App::Perlbrew::Util) perl(App::perlbrew) perl-App-perlbrew"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(CPAN::Perl::Releases) perl(Capture::Tiny) perl(Devel::PatchPerl) perl(ExtUtils::MakeMaker) perl(File::Temp) perl(JSON::PP) perl(Pod::Parser) perl(Pod::Usage) perl(local::lib)"

inherit rpm
