SUMMARY = "Distutils/Setuptools Adapter"
DESCRIPTION = "This package adds support for common build additions to distutils. \
This includes the following: \
 \
  * gettext/i18n \
  * documentation \
  * program icons"
LICENSE = "GPL-2.0-only"

PV = "2.50"

RPM_NAME = "python311-distutils-extra-2.50-1.1.noarch.rpm"
RPM_HASH = "7cec7dca9327daaafbfefcb61c26f686d1cd7b101264a391c3d0dde345d057a2db57c651daee529ea13f4f594d3d909c4ac9c9d2837ffdb8d3c96c03dbe64938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-distutils-extra) python311-distutils-extra python3dist(python-distutils-extra)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
