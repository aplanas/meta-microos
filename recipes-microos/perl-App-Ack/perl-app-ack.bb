SUMMARY = "Grep-Like Text Finder Perl Module"
DESCRIPTION = "App::Ack is a grep-like tool tailored to working with large trees of source \
code."
LICENSE = "Artistic-2.0"

PV = "3.7.0"

RPM_NAME = "perl-App-Ack-3.7.0-1.1.noarch.rpm"
RPM_HASH = "6843bed66c7d8b7bc98f26aee66377bc39a0fb08044822e67426839865cd1313797071e6cee04734779ed292415195f22cbae28c575a446b61bff32e9c9443db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(App::Ack) perl(App::Ack::ConfigDefault) perl(App::Ack::ConfigFinder) perl(App::Ack::ConfigLoader) perl(App::Ack::File) perl(App::Ack::Files) perl(App::Ack::Filter) perl(App::Ack::Filter::Collection) perl(App::Ack::Filter::Default) perl(App::Ack::Filter::Extension) perl(App::Ack::Filter::ExtensionGroup) perl(App::Ack::Filter::FirstLineMatch) perl(App::Ack::Filter::Inverse) perl(App::Ack::Filter::Is) perl(App::Ack::Filter::IsGroup) perl(App::Ack::Filter::IsPath) perl(App::Ack::Filter::IsPathGroup) perl(App::Ack::Filter::Match) perl(App::Ack::Filter::MatchGroup) perl-App-Ack"
RDEPENDS:${PN} += "perl(File::Next) perl-base"

inherit rpm
