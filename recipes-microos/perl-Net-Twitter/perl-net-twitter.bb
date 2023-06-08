SUMMARY = "Perl Interface to the Twitter Api"
DESCRIPTION = "This module has been superseded by Twitter::API. Please update as soon as \
you possibly can to use new features and the new API versions. This module \
will no longer be supported. \
 \
This module provides a perl interface to the Twitter APIs. See \
http://dev.twitter.com/docs for a full description of the Twitter APIs."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "4.01043"

RPM_NAME = "perl-Net-Twitter-4.01043-1.18.noarch.rpm"
RPM_HASH = "39449f7c9a5df62cd70c38d23da054194c1d5b54203b92c969bf6680355f8b4f9ed9015a8c554d242ce2b5c9cee1bcfdf70038d4a525d567dee6494b29fbd7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::Identica) perl(Net::Twitter) perl(Net::Twitter::API) perl(Net::Twitter::Core) perl(Net::Twitter::Error) perl(Net::Twitter::Meta::Method) perl(Net::Twitter::OAuth) perl(Net::Twitter::Role::API::Lists) perl(Net::Twitter::Role::API::REST) perl(Net::Twitter::Role::API::RESTv1_1) perl(Net::Twitter::Role::API::Search) perl(Net::Twitter::Role::API::Search::Trends) perl(Net::Twitter::Role::API::TwitterVision) perl(Net::Twitter::Role::API::Upload) perl(Net::Twitter::Role::API::UploadMedia) perl(Net::Twitter::Role::AppAuth) perl(Net::Twitter::Role::AutoCursor) perl(Net::Twitter::Role::InflateObjects) perl(Net::Twitter::Role::Legacy) perl(Net::Twitter::Role::OAuth) perl(Net::Twitter::Role::RateLimit) perl(Net::Twitter::Role::RetryOnError) perl(Net::Twitter::Role::SimulateCursors) perl(Net::Twitter::Role::WrapError) perl(Net::Twitter::Role::WrapResult) perl(Net::Twitter::Search) perl(Net::Twitter::Types) perl(Net::Twitter::WrappedResult) perl-Net-Twitter"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Carp::Clan) perl(Class::Load) perl(Data::Visitor::Callback) perl(DateTime) perl(DateTime::Format::Strptime) perl(Devel::StackTrace) perl(Digest::SHA) perl(HTML::Entities) perl(HTTP::Request::Common) perl(IO::Socket::SSL) perl(JSON::MaybeXS) perl(LWP::Protocol::https) perl(Moose) perl(Moose::Exporter) perl(Moose::Meta::Method) perl(Moose::Role) perl(Moose::Util::TypeConstraints) perl(MooseX::Role::Parameterized) perl(Net::HTTP) perl(Net::OAuth) perl(Try::Tiny) perl(URI) perl(URI::Escape) perl(namespace::autoclean)"

inherit rpm
