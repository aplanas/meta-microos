SUMMARY = "Collection of utilities to help create documentation"
DESCRIPTION = "yelp-tools is a collection of scripts and build utilities to help create, \
manage, and publish documentation for Yelp and the web. Most of the heavy \
lifting is done by packages like yelp-xsl and itstool. This package just \
wraps things up in a developer-friendly way."
LICENSE = "GPL-2.0-or-later"

PV = "42.1"

RPM_NAME = "yelp-tools-42.1-1.2.noarch.rpm"
RPM_HASH = "a856ec1a3cce464efd641c62702b59431dd2ea2b22cc926a1ee843f510f1efea669dc0504cd2d9e90943420a7afc61f177b8b8c6e8c3a7315c971b73275bc829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yelp-tools"
RDEPENDS:${PN} += "/usr/bin/python3 itstool libxml2-tools libxslt"

inherit rpm
