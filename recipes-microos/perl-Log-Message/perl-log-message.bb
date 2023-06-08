SUMMARY = "A generic message storing mechanism"
DESCRIPTION = "Log::Message is a generic message storage mechanism. It allows you to store \
messages on a stack -- either shared or private -- and assign meta-data to \
it. Some meta-data will automatically be added for you, like a timestamp \
and a stack trace, but some can be filled in by the user, like a tag by \
which to identify it or group it, and a level at which to handle the \
message (for example, log it, or die with it) \
 \
Log::Message also provides a powerful way of searching through items by \
regexes on messages, tags and level."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Log-Message-0.08-3.26.noarch.rpm"
RPM_HASH = "2b03a94c3f6170659571560cb07b2d8db3127bb7acaef9e424d7fad4e15a80445b88046fb6fe96d3ba36d1da71ba00a553b353625842f14aa2b29aa84889ca7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Log::Message) perl(Log::Message::Config) perl(Log::Message::Handlers) perl(Log::Message::Item) perl-Log-Message"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Locale::Maketext::Simple) perl(Module::Load) perl(Params::Check)"

inherit rpm
