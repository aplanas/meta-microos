SUMMARY = "Persistent Storage for Arbitrary Data (for Embperl)"
DESCRIPTION = "Apache::SessionX extends Apache::Session. It was initially written to \
use Apache::Session from inside of HTML::Embperl, but is seems to be \
useful outside of Embperl as well, so here is it as standalone module."
LICENSE = "GPL-2.0+"

PV = "2.01"

RPM_NAME = "perl-Apache-SessionX-2.01-244.27.aarch64.rpm"
RPM_HASH = "ee80010a0f4c3d457d5290f9be20b820f2de5b44a5e434c92b33f5b016fc036491209b446d0a8736e1c2f7ced95884e8eb5760bbdf55473c0dadaee151b16c61"

RPROVIDES:${PN} += "Apache-SessionX perl(Apache::SessionX) perl(Apache::SessionX::Config) perl(Apache::SessionX::Generate::MD5) perl(Apache::SessionX::Manager) perl(Apache::SessionX::Store::File) perl-Apache-SessionX perl-Apache-SessionX(aarch-64)"
RDEPENDS:${PN} += "apache2-mod_perl perl(:MODULE_COMPAT_5.36.0) perl-DBI perl-URI"

inherit rpm
