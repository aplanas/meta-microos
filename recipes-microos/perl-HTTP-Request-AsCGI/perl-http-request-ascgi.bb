SUMMARY = "Set up a CGI environment from an HTTP::Request"
DESCRIPTION = "Provides a convenient way of setting up an CGI environment from an \
HTTP::Request."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-HTTP-Request-AsCGI-1.2-13.24.noarch.rpm"
RPM_HASH = "bf9baea146ffa97c84bb02a5ee13b3fd57312aa8849410cd60678754f53cd1f516529b5f3aa6074342d5ec1619d863768c71610f89113468d68a85a075d9f75b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Request::AsCGI) \
perl-HTTP-Request-AsCGI"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Carp) \
perl(Class::Accessor) \
perl(HTTP::Request) \
perl(HTTP::Response) \
perl(IO::File) \
perl(URI::Escape)"

inherit rpm
