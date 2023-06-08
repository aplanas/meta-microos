SUMMARY = "Guess OpenSSL include path"
DESCRIPTION = "Crypt::OpenSSL::Guess provides helpers to guess OpenSSL include path on any \
platforms. \
 \
Often macOS's homebrew OpenSSL cause a problem on installation due to \
include path is not added. Some CPAN module provides to modify include path \
with configure-args, but Carton or Module::CPANfile is not supported to \
pass configure-args to each modules. Crypt::OpenSSL::* modules should use \
it on your Makefile.PL. \
 \
This module resolves the include path by Net::SSLeay's workaround. Original \
code is taken from 'inc/Module/Install/PRIVATE/Net/SSLeay.pm' by \
Net::SSLeay."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Crypt-OpenSSL-Guess-0.15-1.7.noarch.rpm"
RPM_HASH = "4f4a73bdf65a94539adeb08dd3359f8ee51222ebdf5697f3bf71e7033568bb184612397347773f5bfe270b75d80ee045d9c3998c8f765ff4fd607eee1de0ee8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Crypt::OpenSSL::Guess) perl-Crypt-OpenSSL-Guess"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
