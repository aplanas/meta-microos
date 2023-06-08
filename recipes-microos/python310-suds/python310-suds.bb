SUMMARY = "Lightweight SOAP client"
DESCRIPTION = "Suds is a lightweight SOAP-based web service client for Python. \
 \
Although the original suds package stopped releasing versions after \
0.4, many (but not all) other open source projects moved to a \
maintained fork known as 'suds-jurko'. This is a community fork of \
that fork that is releasing packages under the main suds package name \
(and suds-community for consistency until version 2.x of this \
package)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "python310-suds-1.1.2-1.3.noarch.rpm"
RPM_HASH = "5da4e8bcae157349b119fc7cc0c74d0ada1d1d4353ac6af6abcf602782e9af6907c945827191c5552d80e733f880d3924e09d560e967665a6a6873448734072c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-suds python3-suds-community python3-suds-jurko python3.10dist(suds-community) python310-suds python310-suds-community python310-suds-jurko python3dist(suds-community)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
