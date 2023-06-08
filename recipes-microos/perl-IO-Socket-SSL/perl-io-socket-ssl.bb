SUMMARY = "Nearly transparent SSL encapsulation for IO::Socket::INET"
DESCRIPTION = "IO::Socket::SSL makes using SSL/TLS much easier by wrapping the necessary \
functionality into the familiar IO::Socket interface and providing secure \
defaults whenever possible. This way, existing applications can be made \
SSL-aware without much effort, at least if you do blocking I/O and don't \
use select or poll. \
 \
But, under the hood, SSL is a complex beast. So there are lots of methods \
to make it do what you need if the default behavior is not adequate. \
Because it is easy to inadvertently introduce critical security bugs or \
just hard to debug problems, I would recommend studying the following \
documentation carefully. \
 \
The documentation consists of the following parts: \
 \
* * 'Essential Information About SSL/TLS' \
 \
* * 'Basic SSL Client' \
 \
* * 'Basic SSL Server' \
 \
* * 'Common Usage Errors' \
 \
* * 'Common Problems with SSL' \
 \
* * 'Using Non-Blocking Sockets' \
 \
* * 'Advanced Usage' \
 \
* * 'Integration Into Own Modules' \
 \
* * 'Description Of Methods' \
 \
Additional documentation can be found in \
 \
* * IO::Socket::SSL::Intercept - Doing Man-In-The-Middle with SSL \
 \
* * IO::Socket::SSL::Utils - Useful functions for certificates etc"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.081"

RPM_NAME = "perl-IO-Socket-SSL-2.081-1.1.noarch.rpm"
RPM_HASH = "d1cc4e9ce4b50b8ae1fc58c21f7067b99bf27c95d15bf2a2ad14bd3ac3e9604c9f77109ef93d9c9ae517f3faa506a231f079f82f7b76f1e5a48b46708ef5952c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::Socket::SSL) perl(IO::Socket::SSL::Intercept) perl(IO::Socket::SSL::OCSP_Cache) perl(IO::Socket::SSL::OCSP_Resolver) perl(IO::Socket::SSL::PublicSuffix) perl(IO::Socket::SSL::SSL_Context) perl(IO::Socket::SSL::SSL_HANDLE) perl(IO::Socket::SSL::Session_Cache) perl(IO::Socket::SSL::Trace) perl(IO::Socket::SSL::Utils) perl-IO-Socket-SSL"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Net::SSLeay)"

inherit rpm
