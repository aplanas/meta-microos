SUMMARY = "Metapackage that contains the dependencies of os-autoinst-distri-opensuse"
DESCRIPTION = "Metapackage that contains the dependencies of os-autoinst-distri-opensuse."
LICENSE = "MIT"

PV = "1.1674229328.3f0c40ae"

RPM_NAME = "os-autoinst-distri-opensuse-deps-1.1674229328.3f0c40ae-1.1.noarch.rpm"
RPM_HASH = "3e9d5027168a025d354209995b3ace18b8c49352a9c00436751272ea8914ae1eeb43d1fd826f8cd75461b3b527655c932911df75a9d78e8e7975fe9df8d4ddfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-autoinst-distri-opensuse-deps"
RDEPENDS:${PN} += "perl(Carp) perl(Class::Accessor::Fast) perl(Code::DRY) perl(Config::Tiny) perl(Cwd) perl(Data::Dump) perl(Data::Dumper) perl(DateTime) perl(Digest::file) perl(Exporter) perl(File::Basename) perl(File::Copy) perl(File::Find) perl(File::Path) perl(File::Temp) perl(IO::File) perl(IO::Socket::INET) perl(LWP::Simple) perl(List::MoreUtils) perl(List::Util) perl(Mojo::Base) perl(Mojo::File) perl(Mojo::JSON) perl(Mojo::UserAgent) perl(Mojo::Util) perl(Net::IP) perl(NetAddr::IP) perl(POSIX) perl(Perl::Critic::Freenode) perl(Regexp::Common) perl(Selenium::Chrome) perl(Selenium::Remote::Driver) perl(Selenium::Remote::WDKeys) perl(Selenium::Waiter) perl(SemVer) perl(Storable) perl(Term::ANSIColor) perl(Test::Assert) perl(Tie::IxHash) perl(Time::HiRes) perl(XML::LibXML) perl(XML::Simple) perl(XML::Writer) perl(YAML::PP) perl(constant) perl(parent) perl(strict) perl(utf8) perl(version) perl(warnings)"

inherit rpm
