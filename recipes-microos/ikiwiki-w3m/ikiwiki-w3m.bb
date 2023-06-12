SUMMARY = "Ikiwiki w3m cgi meta-wrapper"
DESCRIPTION = "Enable to use all of ikiwiki's web features (page editing, etc) in \
the w3m web browser without using a web server. w3m supports local \
CGI scripts, and ikiwiki can be set up to run that way."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause"

PV = "3.20200202.3"

RPM_NAME = "ikiwiki-w3m-3.20200202.3-2.13.noarch.rpm"
RPM_HASH = "188ccf2dd74367e7f4260e19ae674b051afadf04ad45cb76fa8f85030a1f21aab4a8c5f11f38c5e9c0c76d321018fa808d448c9c1fd69f215645871943626311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ikiwiki-w3m"
RDEPENDS:${PN} += "/usr/bin/perl \
ikiwiki \
w3m"

inherit rpm
