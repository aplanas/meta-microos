SUMMARY = "Development files for the curl library"
DESCRIPTION = "Curl is a client to get documents and files from or send documents to a \
server using any of the supported protocols (HTTP, HTTPS, FTP, GOPHER, \
DICT, TELNET, LDAP, or FILE). The command is designed to work without \
user interaction or any kind of interactivity."
LICENSE = "curl"

PV = "8.0.1"

RPM_NAME = "libcurl-devel-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "583b040b59b53aaf1ff785d7817a3bebb89e0b3447c91187cda27c64b2135304fb1fa671635b87e94dcfcef99391f47f8e5a46e9c232fe16069a4db99b747722"

RPROVIDES:${PN} += "curl-devel libcurl-devel libcurl-devel(aarch-64) pkgconfig(libcurl)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config glibc-devel libcurl4"

inherit rpm
