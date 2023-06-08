SUMMARY = "The nginx source"
DESCRIPTION = "The source of nginx [engine x] HTTP server and IMAP/POP3 proxy server."
LICENSE = "BSD-2-Clause"

PV = "1.23.4"

RPM_NAME = "nginx-source-1.23.4-1.1.noarch.rpm"
RPM_HASH = "221d07cf5f351eb3748543435b981ca1ebf6428672ea95581add2baef3e5e6ce9d3753b17d793f2a7e9a4db2e280dcc76f69e462fa0afab68ba373bae2f394f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nginx-source perl(nginx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl gcc-c++ libatomic-ops-devel nginx nginx-macros pkgconfig pkgconfig(gdlib) pkgconfig(libpcre2-8) pkgconfig(libxslt) pkgconfig(openssl) pkgconfig(zlib) vim"

inherit rpm
