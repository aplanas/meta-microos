SUMMARY = "PSGI handler for HTTP::Server::Simple"
DESCRIPTION = "HTTP::Server::Simple::PSGI is a HTTP::Server::Simple based HTTP server that \
can run PSGI applications. This module only depends on \
HTTP::Server::Simple, which itself doesn't depend on any non-core modules \
so it's best to be used as an embedded web server."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-HTTP-Server-Simple-PSGI-0.16-1.10.noarch.rpm"
RPM_HASH = "5b1510f70e0be9db6b2ce8c12d6b48b4b7da8a6a829c8ca9ae8f86c7d18523f586d0e87bb001076423b26881ca62cad88acb7426452ecb9e10abcf5bb48f109e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Server::Simple::PSGI) perl(HTTP::Server::Simple::PSGI::Writer) perl(Plack::Handler::HTTP::Server::Simple) perl(Plack::Handler::HTTP::Server::Simple::PSGIServer) perl-HTTP-Server-Simple-PSGI"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(HTTP::Server::Simple)"

inherit rpm
