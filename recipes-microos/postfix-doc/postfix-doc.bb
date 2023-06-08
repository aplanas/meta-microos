SUMMARY = "Documentations for the postfix package"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program. \
This package contains the documentation for postfix"
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-doc-3.8.0-2.1.noarch.rpm"
RPM_HASH = "6e65e3c33b752bf6b3936661d778bdea591b02f0d396cb6c068d40d21419e72c8e6e840f6f297e23d85bdb6284d407edc08d8a6ea1c4e7b4df825d29d59a88f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postfix-doc"
RDEPENDS:${PN} += ""

inherit rpm
