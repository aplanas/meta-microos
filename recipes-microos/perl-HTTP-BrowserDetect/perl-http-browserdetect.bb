SUMMARY = "Determine Web browser, version, and platform from an HTTP user agent string"
DESCRIPTION = "The HTTP::BrowserDetect object does a number of tests on an HTTP user agent \
string. The results of these tests are available via methods of the object. \
 \
For an online demonstration of this module's parsing, you can check out \
http://www.browserdetect.org/ \
 \
This module was originally based upon the JavaScript browser detection code \
available at \
http://www.mozilla.org/docs/web-developer/sniffer/browser_type.html."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.38"

RPM_NAME = "perl-HTTP-BrowserDetect-3.38-1.1.noarch.rpm"
RPM_HASH = "f6212b3203a85d1d4b548f31cbed24f085ba085ee3cc645eaf98315df963f440d2d3d5a7607e9cf2399f595c1a7140ebbe786fb5e9f376111d61c9f8f39b489e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::BrowserDetect) perl-HTTP-BrowserDetect"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
