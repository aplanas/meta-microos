SUMMARY = "Media asset management for Python, with glue code for various web frameworks"
DESCRIPTION = "Merges, minifies and compresses Javascript and CSS files, supporting a variety \
of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports \
URL rewriting in CSS files."
LICENSE = "Apache-2.0 & BSD-2-Clause & LGPL-2.1-only & BSD-3-Clause & MIT"

PV = "2.0"

RPM_NAME = "python311-webassets-2.0-3.11.noarch.rpm"
RPM_HASH = "3f0090706fd158b16d37ec442a52cf2a143423083335f85f9f23e61a9bc1d4354e5d31c1cc957070938498e5e3a83265fb5b8525474357fe85ab7bdda3e9cbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(webassets) python311-webassets python3dist(webassets)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-setuptools update-alternatives"

inherit rpm
