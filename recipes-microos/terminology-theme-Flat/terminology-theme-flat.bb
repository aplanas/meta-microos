SUMMARY = "Default terminology theme(Flat)"
DESCRIPTION = "The default theme for terminology install when using openSUSE branding."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-Flat-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "ea3a796b8c6635c317e3ced70a2a5c7950f7ae2b01ccfe0c811358e4cce7859ed967c6c07ca8ded016c4084b08db0fd39abf04305c9bbaa7727a4fc42bbe713d"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-Flat \
terminology-theme-Flat(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
