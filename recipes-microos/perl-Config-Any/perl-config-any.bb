SUMMARY = "Load configuration from different file formats, transparently"
DESCRIPTION = "Config::Any provides a facility for Perl applications and libraries to load \
configuration data from multiple different file formats. It supports XML, \
YAML, JSON, Apache-style configuration, Windows INI files, and even Perl \
code. \
 \
The rationale for this module is as follows: Perl programs are deployed on \
many different platforms and integrated with many different systems. \
Systems administrators and end users may prefer different configuration \
formats than the developers. The flexibility inherent in a multiple format \
configuration loader allows different users to make different choices, \
without generating extra work for the developers. As a developer you only \
need to learn a single interface to be able to use the power of different \
configuration formats."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Config-Any-0.33-1.1.noarch.rpm"
RPM_HASH = "fe5a9fca38ec6e0cecae8987bb41d9fac8d9fa812f4873cebb54809b033710903d00986fb50c1aa68e2570a0e7224c118fa53cca8ec95330a405a96f47f12f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Config::Any) perl(Config::Any::Base) perl(Config::Any::General) perl(Config::Any::INI) perl(Config::Any::JSON) perl(Config::Any::Perl) perl(Config::Any::XML) perl(Config::Any::YAML) perl-Config-Any"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Module::Pluggable::Object)"

inherit rpm
