SUMMARY = "HTTP::Tiny compatible HTTP client wrappers"
DESCRIPTION = "HTTP::Tinyish is a wrapper module for HTTP client modules LWP, HTTP::Tiny \
and HTTP client software 'curl' and 'wget'. \
 \
It provides an API compatible to HTTP::Tiny, and the implementation has \
been extracted out of App::cpanminus. This module can be useful in a \
restrictive environment where you need to be able to download CPAN modules \
without an HTTPS support in built-in HTTP library."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18"

RPM_NAME = "perl-HTTP-Tinyish-0.18-1.4.noarch.rpm"
RPM_HASH = "5e188dbc14551541bdb8c463699e6ab9d5908c0ea2cb3e36368517de4e00e28a612b16d80d48e9d1f6c04b1fca931656ded230f37e14c0f00af7e7cc17652527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Tinyish) perl(HTTP::Tinyish::Base) perl(HTTP::Tinyish::Curl) perl(HTTP::Tinyish::HTTPTiny) perl(HTTP::Tinyish::LWP) perl(HTTP::Tinyish::Wget) perl-HTTP-Tinyish"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(File::Which) perl(HTTP::Tiny) perl(IPC::Run3) perl(parent)"

inherit rpm
