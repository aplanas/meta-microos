SUMMARY = "Minimalistic REST server"
DESCRIPTION = "MREST stands for 'minimalistic' or 'mechanical' REST server. (Mechanical \
because it relies on Web::Machine.) \
 \
Web::MREST provides a fully functional REST server that can be started with \
a simple command. Without modification, the server provides a set of \
generalized resources that can be used to demonstrate how the REST server \
works, or for testing. \
 \
Developers can use Web::MREST as a platform for implementing their own REST \
servers, as described below. App::Dochazka::REST is a 'real-world' example \
of such a server. \
 \
For an introduction to REST and Web Services, see \
Web::MREST::WebServicesIntro."
LICENSE = "BSD-3-Clause"

PV = "0.288"

RPM_NAME = "perl-Web-MREST-0.288-1.19.noarch.rpm"
RPM_HASH = "d3da987d9a33615bad56791913b289f741009c167cda909135bf4afec51746f1e0ce07cdc74e0c64349f0da2d03f7a17b2a933fc307748a424ed22ae46a154c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Web::MREST) \
perl(Web::MREST::Dispatch) \
perl(Web::MREST::Entity) \
perl(Web::MREST::InitRouter) \
perl(Web::MREST::Resource) \
perl(Web::MREST::Test) \
perl(Web::MREST::Test::503) \
perl(Web::MREST::Test::Forbidden) \
perl(Web::MREST::Test::Unauthorized) \
perl(Web::MREST::Util) \
perl(Web::MREST::WebServicesIntro) \
perl-Web-MREST"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(App::CELL) \
perl(File::ShareDir) \
perl(HTTP::Request) \
perl(HTTP::Request::Common) \
perl(JSON) \
perl(LWP::Protocol::https) \
perl(LWP::UserAgent) \
perl(Module::Runtime) \
perl(Params::Validate) \
perl(Path::Router) \
perl(Plack::Middleware::LogErrors) \
perl(Plack::Middleware::Session) \
perl(Plack::Middleware::StackTrace) \
perl(Plack::Runner) \
perl(Pod::Simple::HTML) \
perl(Pod::Simple::Text) \
perl(Test::Deep::NoTest) \
perl(Try::Tiny) \
perl(URI::Escape) \
perl(Web::MREST::CLI) \
perl(Web::Machine)"

inherit rpm
