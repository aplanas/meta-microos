SUMMARY = "Fast, Primitive Http Request Parser"
DESCRIPTION = "HTTP::Parser::XS is a fast, primitive HTTP request/response parser. \
 \
The request parser can be used either for writing a synchronous HTTP server \
or a event-driven server. \
 \
The response parser can be used for writing HTTP clients. \
 \
Note that even if this distribution name ends '::XS', *pure Perl* \
implementation is supported, so you can use this module on compiler-less \
environments."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-HTTP-Parser-XS-0.17-2.28.aarch64.rpm"
RPM_HASH = "b27618943547cca7c03f16ac7edb6586dd4a179ba61a3423d8b05db2deff4d6f0f3b01caae43a5c2c32328c35ce82e7b41931b93aad9e20ec5e73c5f6e6411c0"

RPROVIDES:${PN} += "perl(HTTP::Parser::XS) \
perl(HTTP::Parser::XS::PP) \
perl-HTTP-Parser-XS \
perl-HTTP-Parser-XS(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
