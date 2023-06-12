SUMMARY = "Cleans up HTML code for web browsers, not humans"
DESCRIPTION = "The HTML::Clean module encapsulates a number of common techniques for \
minimizing the size of HTML files. You can typically save between 10% and \
50% of the size of a HTML file using these methods. It provides the \
following features: \
 \
* Remove unneeded whitespace (beginning of line, etc) \
 \
* Remove unneeded META elements. \
 \
* Remove HTML comments (except for styles, javascript and SSI) \
 \
* Replace tags with equivalent shorter tags (<strong> --> <b>) \
 \
* etc. \
 \
The entire process is configurable, so you can pick and choose what you want \
to clean."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.4"

RPM_NAME = "perl-HTML-Clean-1.4-1.15.noarch.rpm"
RPM_HASH = "b9ca5448814f5f965dd35f3c32c2458f3bdbbd876f8180c24712cdb56a6e114e496d4c87318b948cf627d505381e4b8ed00a9f02bab07d671c093d538a82c2b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::Clean) \
perl-HTML-Clean"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
