SUMMARY = "Bringing loggers and listeners together"
DESCRIPTION = "'Log::Any' provides a standard log production API for modules. \
Log::Any::Adapter allows applications to choose the mechanism for log \
consumption, whether screen, file or another logging mechanism like \
Log::Dispatch or Log::Log4perl. \
 \
Many modules have something interesting to say. Unfortunately there is no \
standard way for them to say it - some output to STDERR, others to 'warn', \
others to custom file logs. And there is no standard way to get a module to \
start talking - sometimes you must call a uniquely named method, other \
times set a package variable. \
 \
This being Perl, there are many logging mechanisms available on CPAN. Each \
has their pros and cons. Unfortunately, the existence of so many mechanisms \
makes it difficult for a CPAN author to commit his/her users to one of \
them. This may be why many CPAN modules invent their own logging or choose \
not to log at all. \
 \
To untangle this situation, we must separate the two parts of a logging \
API. The first, _log production_, includes methods to output logs (like \
'$log->debug') and methods to inspect whether a log level is activated \
(like '$log->is_debug'). This is generally all that CPAN modules care \
about. The second, _log consumption_, includes a way to configure where \
logging goes (a file, the screen, etc.) and the code to send it there. This \
choice generally belongs to the application. \
 \
A CPAN module uses 'Log::Any' to get a log producer object. An application, \
in turn, may choose one or more logging mechanisms via Log::Any::Adapter, \
or none at all. \
 \
'Log::Any' has a very tiny footprint and no dependencies beyond Perl 5.8.1, \
which makes it appropriate for even small CPAN modules to use. It defaults \
to 'null' logging activity, so a module can safely log without worrying \
about whether the application has chosen (or will ever choose) a logging \
mechanism. \
 \
See http://www.openswartz.com/2007/09/06/standard-logging-api/ for the \
original post proposing this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.714"

RPM_NAME = "perl-Log-Any-1.714-1.1.noarch.rpm"
RPM_HASH = "ccf95ba693c5d53a4b2d5b952ac2e96f18f087cb0518380cab0305b34f309407d1c1d06278ebd5ea91e8a0058359faab8560b40a20fecb33e56abe7e876323a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Log::Any) perl(Log::Any::Adapter) perl(Log::Any::Adapter::Base) perl(Log::Any::Adapter::Capture) perl(Log::Any::Adapter::File) perl(Log::Any::Adapter::Multiplex) perl(Log::Any::Adapter::Null) perl(Log::Any::Adapter::Stderr) perl(Log::Any::Adapter::Stdout) perl(Log::Any::Adapter::Syslog) perl(Log::Any::Adapter::Test) perl(Log::Any::Adapter::Util) perl(Log::Any::Manager) perl(Log::Any::Proxy) perl(Log::Any::Proxy::Null) perl(Log::Any::Proxy::Test) perl(Log::Any::Proxy::WithStackTrace) perl(Log::Any::Test) perl-Log-Any"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
