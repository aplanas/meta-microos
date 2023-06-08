SUMMARY = "Irregular methods for regular expressions"
DESCRIPTION = "A command line tool and python module that generates all or random matching strings to a given regular expression and more."
LICENSE = "AGPL-3.0-or-later"

PV = "0.11.0"

RPM_NAME = "python39-exrex-0.11.0-1.2.noarch.rpm"
RPM_HASH = "cf59683431c587384d801abe3b0d8183841553098fa9838182b11672c17587136c030a60ac665a8639e99ba24f3fc53c4bb2885a83171da7ebcc54c99ddb680d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(exrex) python39-exrex python3dist(exrex)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools update-alternatives"

inherit rpm
