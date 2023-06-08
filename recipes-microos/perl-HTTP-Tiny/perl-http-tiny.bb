SUMMARY = "Small, simple, correct HTTP/1.1 client"
DESCRIPTION = "This is a very simple HTTP/1.1 client, designed for doing simple requests \
without the overhead of a large framework like LWP::UserAgent. \
 \
It is more correct and more complete than HTTP::Lite. It supports proxies \
and redirection. It also correctly resumes after EINTR. \
 \
If IO::Socket::IP 0.25 or later is installed, HTTP::Tiny will use it \
instead of IO::Socket::INET for transparent support for both IPv4 and IPv6. \
 \
Cookie support requires HTTP::CookieJar or an equivalent class."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.082"

RPM_NAME = "perl-HTTP-Tiny-0.082-1.2.noarch.rpm"
RPM_HASH = "708bab69ad09660e908260976727b1b52e86ef1d22c01546acea8301d467ad4112f6b7dbaae8fc1ee4630b2247d944767d40ad7746a4bbfcce6b0907c3d010dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Tiny) perl-HTTP-Tiny"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
