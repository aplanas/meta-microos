SUMMARY = "Locate (written) numbers in English text"
DESCRIPTION = "This module provides a regular expression for finding numbers in English \
text. It also provides functions for extracting and manipulating such \
numbers."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.32"

RPM_NAME = "perl-Lingua-EN-FindNumber-1.32-1.25.noarch.rpm"
RPM_HASH = "b753a07c3fd65b2f5cb5ebf0c6afe87583c65c4e1a705a320bb2610e626fbde0c12aecf65d012a4cdf1bcd5195ab4c4c4145b4fd67a8ba2914670f3c649a5efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::EN::FindNumber) perl-Lingua-EN-FindNumber"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Lingua::EN::Words2Nums)"

inherit rpm
