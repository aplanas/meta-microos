SUMMARY = "Find URIs in arbitrary text"
DESCRIPTION = "This module does one thing: Finds URIs and URLs in plain text. It finds \
them quickly and it finds them *all* (or what URI.pm considers a URI to \
be.) It only finds URIs which include a scheme (http:// or the like), for \
something a bit less strict have a look at URI::Find::Schemeless. \
 \
For a command-line interface, urifind is provided."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "20160806"

RPM_NAME = "perl-URI-Find-20160806-1.22.noarch.rpm"
RPM_HASH = "7e238a8f352d1a31efa2488a4bd36da10aff6ef28ccafe170be2dee6676b4f7f3279d020e76fd07e88ca49ac3d81eb5f0873d5a04d75d25fee7063741caa658e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(URI::Find) \
perl(URI::Find::Schemeless) \
perl-URI-Find"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(URI)"

inherit rpm
