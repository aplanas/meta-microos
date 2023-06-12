SUMMARY = "Find the differences between two arrays"
DESCRIPTION = "This module compares two *pre-sorted* arrays and returns the added or \
deleted elements in two separate arrays. It's a simple wrapper around \
Algorithm::Diff. \
 \
*Note*: the arrays must be sorted before you call 'diff'. \
 \
And if you need more complex array tools, check Array::Compare."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Array-Diff-0.09-1.9.noarch.rpm"
RPM_HASH = "4bafe43c4cafc18e780c9d35c5619736cbedfaddb781d0c4c50b403d00ae5efb69dad1aba1ede4f170a444f093630a6b9af185907d3b42afcbc330d42cc88ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Array::Diff) \
perl-Array-Diff"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Algorithm::Diff) \
perl(Class::Accessor::Fast)"

inherit rpm
