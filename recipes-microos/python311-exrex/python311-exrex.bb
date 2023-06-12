SUMMARY = "Irregular methods for regular expressions"
DESCRIPTION = "A command line tool and python module that generates all or random matching strings to a given regular expression and more."
LICENSE = "AGPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "python311-exrex-0.11.0-1.2.noarch.rpm"
RPM_HASH = "bdeb05fba4131287d2bfc5c658f19bdb1e9a697f0bfc3576b6b869fb52dfd169fc0b8735110fc8b3a599595094f00821133e8217bcfb0857453209b39b7e9d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(exrex) \
python311-exrex \
python3dist(exrex)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
