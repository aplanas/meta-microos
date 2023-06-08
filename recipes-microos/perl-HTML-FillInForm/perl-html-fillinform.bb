SUMMARY = "Populates HTML Forms with data"
DESCRIPTION = "This module fills in an HTML form with data from a Perl data structure, \
allowing you to keep the HTML and Perl separate. \
 \
Here are two common use cases: \
 \
1. A user submits an HTML form without filling out a required field. You \
want to redisplay the form with all the previous data in it, to make it \
easy for the user to see and correct the error. \
 \
2. You have just retrieved a record from a database and need to display it \
in an HTML form."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.22"

RPM_NAME = "perl-HTML-FillInForm-2.22-1.8.noarch.rpm"
RPM_HASH = "d2ef430b1cfe0eae5291739acb930831d7c94ad50875c8410579ea01d8ee8ab7de8b962dbb74fe2657ff32d3a23cba7f4e3d99d9e44adc2da01fedb69cf98af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::FillInForm) perl-HTML-FillInForm"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
